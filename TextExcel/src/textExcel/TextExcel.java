package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextExcel{

	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    boolean quit = false;
	    Spreadsheet SuperDuperSpreadsheet = new Spreadsheet();
	    do {
	    	String inputCommand = input.nextLine();
	    	if(inputCommand.equals("quit")) {
        		quit = true;
        	}else {
    	    	System.out.println(SuperDuperSpreadsheet.processCommand(inputCommand));
        	}
	    	
	    }while(!quit);
	}
}
