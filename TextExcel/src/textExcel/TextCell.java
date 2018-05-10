package textExcel;

public class TextCell implements Cell{
	String cellString;
	
	public TextCell(String cellString) {
		this.cellString = cellString;
	}
	
	@Override
	public String abbreviatedCellText() {
		//Takes out the quotes
		String stringed = cellString.substring(1, cellString.length() - 1); 
		
		//quotes than parsed accordingly
		if(stringed.length() > 10) {
			stringed = stringed.substring(0,10);
		}else {
			for(int i = stringed.length(); i < 10; i++) {
				stringed += " ";
			}
		}
		return stringed;
	}

	@Override
	public String fullCellText() {
		return cellString;
	}
	
	

}