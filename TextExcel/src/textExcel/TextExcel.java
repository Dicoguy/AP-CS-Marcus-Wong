package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextExcel{

	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    Spreadsheet jonatan = new Spreadsheet();
	    do {
	    	String inputCommand = input.nextLine();
	    	jonatan.processCommand(inputCommand);
	    	if(inputCommand.equals("quit")) {
        		break;
        	}
	    }while(true);
	}
}
