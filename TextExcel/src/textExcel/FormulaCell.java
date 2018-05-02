package textExcel;

public class FormulaCell extends RealCell{
	
	String[] splitFormula = (getValue().substring(2,getValue().length()-2)).split(" ");
	
	public Cell[][] spreadsheet; 
	public FormulaCell(String input, Cell[][] spreadsheet) {
		super(input);
		this.spreadsheet = spreadsheet;
	}

	@Override
	public String abbreviatedCellText() {
		if((getDoubleValue() + "").length() > 10) {
			return (getDoubleValue() + "").substring(0,10);
		}else {
			String spaces = "";
			for(int i = 0; i < 10 - (getDoubleValue() + "").length(); i++) {
				 spaces += " ";
			}
			return (getDoubleValue()) + spaces;
		}
	}
	
	public double getDoubleValue() {
		//String[] splitFormula = (getValue().substring(2,getValue().length()-2)).split(" ");
		//takes an assignment such as ( 5 - 6 ) and turns it into an array of 5, "-" , 6
		//takes an assignment such as ( A5 - E6 ) and turns it into an array of 5, "-" , 6
		
		if(getValue().toUpperCase().contains("SUM")) {
			String[] cellLocations = splitFormula[1].split("-");
			return sum(cellLocations[0],cellLocations[1]);
		}else if(getValue().toUpperCase().contains("AVG")) {
			String[] cellLocations = splitFormula[1].split("-");
			return avg(cellLocations[0],cellLocations[1]);
		}else {
			//double result = Double.parseDouble(splitFormula[0]);
			for(int i = 0; i <= splitFormula.length-1; i ++) {
				
				if(Character.isLetter(splitFormula[i].charAt(0))){ 
					//purpose of loop is to replace cell locations with
					//associated values		
					Location cell = new SpreadsheetLocation(splitFormula[i]);
					splitFormula[i] = ((RealCell) spreadsheet[cell.getRow()][cell.getCol()]).getDoubleValue() + "";
				}
			}
			if(splitFormula.length <= 1) {
				return Double.parseDouble(splitFormula[0]);
			}
			
			//the initial value if only one operation 
			double result = doOperation(Double.parseDouble(splitFormula[0]), splitFormula[1], Double. parseDouble(splitFormula[2]));
			//moves through the splitFormula array with all doubles and does all the operations
			for (int i = 2; i < splitFormula.length - 1; i += 2) {
				result = doOperation(result, splitFormula[i+1], Double.parseDouble(splitFormula[i+2]));
			}
			return result;
		}
		
		
	}
	
	public double sum(String start, String end) {
		SpreadsheetLocation startString = new SpreadsheetLocation(start);
		SpreadsheetLocation endString = new SpreadsheetLocation(end);
		double returnValue = 0;
		//nested for loops go through specific "window" of arrays
		for(int i = startString.getRow(); i <= endString.getRow(); i++) {
			for(int j = startString.getCol(); j <= endString.getCol(); j++) {
				RealCell cell = (RealCell) spreadsheet[i][j];
				returnValue += cell.getDoubleValue();
			}
		}
		return returnValue;
		
	}
		
	public double avg(String startString, String endString) {
		SpreadsheetLocation startCell = new SpreadsheetLocation(startString);
		SpreadsheetLocation endCell = new SpreadsheetLocation(endString);
		int numCells = ((endCell.getCol() + 1) - startCell.getCol()) * ((endCell.getRow() + 1) - startCell.getRow());
		return sum(startString, endString) / (double) numCells;
	}
	@Override
	public String fullCellText() {
		return getValue();
	}
	
	public double doOperation(double numOne, String operand, double numTwo) {
		double result = 0;
		if(operand.equals("-")) {
			result = numOne - numTwo; 
		}else if(operand.equals("+")) {
			result = numOne + numTwo;
		}else if(operand.equals("*")) {
			result = numOne * numTwo;
		}else if(operand.equals("/")) {
			result = numOne / numTwo;
		}
		return result;
	}

}
