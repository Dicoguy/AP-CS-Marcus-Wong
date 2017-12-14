//Marcus Wong
//12/13/17
//2nd Period
package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
         do {
         	String expression = input.nextLine();
         	if(expression.equals("quit")) {
         		break;
         	}
         	System.out.println(produceAnswer(expression));
         }while(true);
    }
    
   
    public static String produceAnswer(String input){ 
    	Fraction frac = new Fraction(input);
        return frac.toString(frac);
    }

    
    
}

