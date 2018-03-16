package textExcel;

public class test {
	public static void main(String[] args){
		String grid = "";
		for(char letter = 'A'; letter <= 'L'; letter++) {
			if(letter == 'L') {
				grid += "   |" + letter + "         |";
			}else {
				grid += "   |" + letter + "     ";
			}
		}
		
		
		for(int i = 1; i <= 20; i++) {
			if(i >= 10) {
				grid += "\n" + i + " |";        
			}else {
				grid += "\n" + i + "  |";
			}
			
			for(int j = 0; j <= 11; j++) {
				grid += "         |";
			}
		}
		
		System.out.println(grid);
	}
}
