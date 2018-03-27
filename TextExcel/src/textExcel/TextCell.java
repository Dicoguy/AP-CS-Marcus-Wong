package textExcel;

public class TextCell implements Cell{
	String cellString;
	
	@Override
	
	public String abbreviatedCellText() {
		String notCellString = cellString;
		if(notCellString.contains("\"")) {
			String noQuotes = notCellString.substring(1, notCellString.length() - 1);
			
			if(noQuotes.length() > 10) {
				return noQuotes.substring(0,10);
			}else {
				for(int i = cellString.length(); i < 10; i++) {
					noQuotes += " ";
					return noQuotes;
				}
			}
		}else {
			if(cellString.length() > 10) {
				return cellString.substring(0,10);
			}else {
				for(int i = cellString.length(); i < 10; i++) {
					notCellString += " ";
				}
				//System.out.println("NotcellString " + notCellString);
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
