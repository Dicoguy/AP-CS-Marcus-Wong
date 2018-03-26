package textExcel;


public class SpreadsheetLocation implements Location{
	char  row; //letter 
	int col; //number
	private String cellName;
    @Override
    public int getCol(){    	
        return col - 1;
    }
    
    @Override
    public int getRow() {
        return Character.toUpperCase(row) - 65;
    }
    
    public SpreadsheetLocation(String cellName) {
        this.cellName = cellName;
        this.col =  Integer.parseInt(cellName.substring(1));
        this.row =  this.cellName.charAt(0);
    }
}
