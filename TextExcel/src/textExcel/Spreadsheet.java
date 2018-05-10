

package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{

	private Cell[][] spreadsheet = new Cell[20][12];
	public Spreadsheet() {
		for(int row = 0; row < spreadsheet.length; row++) {
			for(int col = 0; col < spreadsheet[row].length; col++){
				spreadsheet[row][col] = new EmptyCell(); 
			}
		}
	}
	
	@Override
	public String processCommand(String command){
			String output = "";
			
			//parses the command into parseable parts
			String cellName = command.split(" ", 3)[0];
			
			/*ensures that if the input is an empty string than it will just 
			return an empty string */
			if(command.equals("")) {
				return output;
				
			//Cell assignment
			}else if(command.contains("=")) { 
				String value = command.split(" ", 3)[2];
				SpreadsheetLocation location = new SpreadsheetLocation(cellName);
			
				if(value.contains("\"")) {
					spreadsheet[location.getRow()][location.getCol()] = new TextCell(value);
					output = getGridText();
				}else if(value.contains("%")) {
					spreadsheet[location.getRow()][location.getCol()] = new PercentCell(value);
					output = getGridText();
				}else if(value.contains(("("))) {
					spreadsheet[location.getRow()][location.getCol()] = new FormulaCell(value, spreadsheet);
					output = getGridText();
				}else {
					spreadsheet[location.getRow()][location.getCol()] = new ValueCell(value);
					output = getGridText();
				}
				
			//Handles clearing operation
			}else if(command.contains("clear") && (command.length() == 8) || (command.length() == 9) ) {
				SpreadsheetLocation location = new SpreadsheetLocation(command.split(" ", 3)[1]);
				spreadsheet[location.getRow()][location.getCol()] = new EmptyCell();
				output = getGridText();
				
			//Clear all
			}else if((command.toLowerCase()).contains("clear") && (command.length() == 5)) { 
				for(int row = 0; row < spreadsheet.length; row++) {
					for(int col = 0; col < spreadsheet[row].length; col++){// add a method
						spreadsheet[row][col] = new EmptyCell(); 
					}
				}
				output = getGridText();			
				
			//Returns specific coordinate value
			}else { 
				SpreadsheetLocation location = new SpreadsheetLocation(cellName);
				output =  spreadsheet[location.getRow()][location.getCol()].fullCellText();
			}
			
			return output;
			
		}
		
	
	
	@Override
	public int getRows(){
		/*return spreadsheet[0].length - 1;
		above command doesn't work for checkpoint 1 for some
		mythical reason but returning 20 works for all the other checkpoints
		even though returning the above command SHOULD work but honestly I just
		want to get this done so yeah this works
		*/
		return 20;
	}

	@Override
	public int getCols(){
		//return  spreadsheet.length - 'A';
		return 12;
	}
	
	@Override
	public Cell getCell(Location loc){
		return spreadsheet[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText(){
		//makes the grid
		String grid = "   ";
		for(char letter = 'A'; letter <= 'L'; letter++) {
				grid += "|" + letter + "         ";
			}
		grid += "|\n";
		
		for(int i = 0; i < 20; i++) {
			if(i < 9) {	
				grid +=  (i + 1) + "  |";        
			}else {
				grid +=  (i + 1) + " |";
			}
			
			for(int j = 0; j < 12; j++) {
				grid += spreadsheet[i][j].abbreviatedCellText() + "|";
			}
			grid += "\n";
		}
		
		
		return grid;
	}
}
