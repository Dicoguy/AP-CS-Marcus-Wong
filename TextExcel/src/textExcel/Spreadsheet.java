

package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	

	int[][] spreadsheet = new int[12][20];
	public Spreadsheet() {
		
		for(int row = 0; row < spreadsheet.length; row++) {
			for(int col = 0; col < spreadsheet[row].length; col++){
				spreadsheet[row][col] = new EmptyCell(); 
			}
		}
	}
	@Override
	public String processCommand(String command){
		return "";
	}

	@Override
	public int getRows(){
		return spreadsheet.length;
	}

	@Override
	public int getCols(){
		return  spreadsheet[0].length;
	}

	@Override
	public Cell getCell(Location loc){
		return null;
	}

	@Override
	public String getGridText(){
		return "pee";
	}

}
