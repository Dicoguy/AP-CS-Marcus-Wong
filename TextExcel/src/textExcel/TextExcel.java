package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextExcel{

	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    TestsALL.Helper th = new TestsALL.Helper();
	    System.out.println(th.getText());
	    do {
	    	String inputCommand = input.nextLine();
	    	if(inputCommand.equals("quit")) {
        		break;
        	}
	    }while(true);
	}
}
