package textExcel;


public class SpreadsheetLocation implements Location{
	int  row; //number 
	char col; //letter
	private String cellName;
    @Override
    public int getCol(){    	
        return col - 65;
    }
    
    @Override
    public int getRow() {
        return row - 1;
    }
    
    public SpreadsheetLocation(String cellName) {
        this.cellName = cellName;
        this.row =  Integer.parseInt(cellName.substring(1));
        this.col =  this.cellName.charAt(0);
    }
}
