package textExcel;

public class FormulaCell extends RealCell{
	
	String[] splitFormula = (getValue().substring(2,getValue().length()-2)).split(" ");
	//String[] splitForm = new String[4];
	
	public Spreadsheet spreadsheet; 
	public FormulaCell(String input, Spreadsheet spreadsheet) {
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
		double result = Double.parseDouble(splitFormula[0]);
		for(int i = 1; i <= splitFormula.length - 2; i += 2) {
			if(Character.isDigit(splitFormula[i].charAt(0))){
				
				
			}
			result = doOperation(result, splitFormula[i], Double.parseDouble(splitFormula[i+1]));
		}
		
		return result;
		
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

	@Override
	public String fullCellText() {
		return getValue();
	}

}
