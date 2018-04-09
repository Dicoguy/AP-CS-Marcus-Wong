package textExcel;


public class SpreadsheetLocation implements Location{
	char col; //letter 
	int row; //number
	private String cellName;
    @Override
    public int getCol(){    	
        return Character.toUpperCase(col) - 'A';
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
