package textExcel;

public class TextCell implements Cell{
	String cellString;
	@Override
	public String abbreviatedCellText() {
		String stringed = cellString.substring(1, cellString.length() - 1);
//		String returnString = "";
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
	
	public TextCell(String cellString) {
		this.cellString = cellString;
	}

/*
public String abbreviatedCellText1() {
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
		
		int numSpaces = 10 - returnString.length();
		for(int i = 0; i < numSpaces; i++) {
			returnString += " ";
		}
	}
	return returnString;
}
*/
}