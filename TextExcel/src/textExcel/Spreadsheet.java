

package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{

	private int rows;
	private int cols;
	
	public Spreadsheet() {
		int[][] spreadsheet = new int[rows][cols];
	}
	@Override
	public String processCommand(String command){
		return null;
	}

	@Override
	public int getRows(){
		return rows;
	}

	@Override
	public int getCols(){
		return cols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
