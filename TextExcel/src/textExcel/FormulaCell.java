package textExcel;
import java.util.ArrayList;
public class FormulaCell extends RealCell{

	public FormulaCell(String input) {
		super(input);
	
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
		String[] splitFormula = (numberString.substring(2,numberString.length()-2)).split(" ");
		//takes an assignment such as ( 5 - 6 ) and turns it into an array of 5, "-" , 6
		ArrayList<Double> doubles = new ArrayList<Double>();
		ArrayList<String> strings = new ArrayList<String>();
		
		
	}
	public double operation(double numOne, String operand, double numTwo) {
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
		return numberString;
	}

}
