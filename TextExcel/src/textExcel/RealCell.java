package textExcel;

public abstract class RealCell implements Cell{
	String numberString;
	@Override
	/*public String abbreviatedCellText() {
		String stringed = numberString.substring(1, numberString.length() - 1);
		if(stringed.length() > 10) {
			stringed = stringed.substring(0,10);
		}else {
			for(int i = stringed.length(); i < 10; i++) {
				stringed += " ";
			}
		}
		return stringed;
	}
	*/
	
	public abstract String abbreviatedCellText();
	public abstract String fullCellText();
	
	public double getDoubleValue() {
		return Double.parseDouble(numberString);
	}
	
	public RealCell(String input) {
		numberString = input;
	}

}
