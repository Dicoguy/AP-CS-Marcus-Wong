package textExcel;

public class TextCell implements Cell{
	String cellString;
	@Override
	public String abbreviatedCellText() {
		if(cellString.length() > 10) {
			return cellString.substring(0,9);
		}else {
			return cellString;
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
