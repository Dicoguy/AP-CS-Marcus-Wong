package textExcel;

public class TextCell implements Cell{
	String cellString;
	String notCellString = cellString;
	@Override
	public String abbreviatedCellText() {
		
		if(cellString.length() > 10) {
			return cellString.substring(0,10);
		}else {
			for(int i = cellString.length(); i < 10; i++) {
				notCellString += " ";
			}
			return notCellString;
		}
	}

	@Override
	public String fullCellText() {
		return cellString;
	}
	
	public TextCell(String cellString) {
		this.cellString = cellString;
	}
}
