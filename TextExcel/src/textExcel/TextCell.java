package textExcel;

public class TextCell implements Cell{
	String cellString;
	
	@Override
	public String abbreviatedCellText() {
		String cellStringTwo = cellString;
		String returnString = "";
		if(cellStringTwo.length() > 10) {
			if(cellStringTwo.contains("\"")) {
				String noQuotes = cellStringTwo.substring(1, cellStringTwo.length() - 1);
				if(noQuotes.length() > 10) {
					for(int i = 0; i < 10; i++) {
						noQuotes += " ";
						returnString += noQuotes.charAt(i);
					}
				}else {
					returnString = noQuotes;
				}
			}
		}else {
			if(cellStringTwo.contains("\"")) {
				returnString = cellStringTwo.substring(1,cellStringTwo.length()-1);
			}else{
				returnString = cellStringTwo;
			}
	
			for(int i = returnString.length(); i < 10; i++) {
				returnString += " ";
			}
		}
		return returnString;
	}

	@Override
	public String fullCellText() {
		return cellString;
	}
	
	public TextCell(String cellString) {
		this.cellString = cellString;
	}
}
