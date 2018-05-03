package textExcel;

public abstract class RealCell implements Cell{
	String numberString;
	
	public abstract String abbreviatedCellText();
	public abstract String fullCellText();
	
	public String getValue() {
		return numberString;
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(numberString);
	}
	
	public RealCell(String input) {
		numberString = input;
	}

}
