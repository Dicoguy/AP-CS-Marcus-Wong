package textExcel;

public class ValueCell extends RealCell {
	
	public ValueCell(String input) {
		super(input);
		
	}
	
	public double getDoubleValue() {
		return super.getDoubleValue();
	}
	
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
	
	
	@Override
	public String fullCellText() {
		return numberString;
	}
	
}