package textExcel;


public class SpreadsheetLocation implements Location{
	private int rows = 20;
	private int cols = 12; 
	
	private String cellName;
    @Override
    public int getRow(){
        return rows;
    }

    @Override
    public int getCol() {
        return cols;
    }
    
    public SpreadsheetLocation(String cellName) {
        this.cellName = cellName;
    }

}
