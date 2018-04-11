package textExcel;

public class ValueCell extends RealCell {
	
	public ValueCell(String input) {
		super(input);
		
	}
	
	public double getDoubleValue() {
		return super.getDoubleValue();
	}
	public String abbreviatedCellText() {
		String returnString = "";
		String stringed = numberString.substring(1, numberString.length() - 1);
		if((getDoubleValue() + "").length() > 10) {
			numberString.substring(0,10);
		}else {
			for(int i = stringed.length(); i < 10; i++) {
				 numberString += " ";
			}
		}
		returnString += numberString;
		return returnString;
		
	}
	@Override
	public String fullCellText() {
		return numberString;
	}
	
}