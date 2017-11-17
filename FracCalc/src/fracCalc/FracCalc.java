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
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){ 
        String[] equation = input.split(" ");
        String firstFrac = equation[0];
        String operand = equation[1];
        String secondFrac = equation[2];
        String[] splitFrac1 = parseString(firstFrac);
        String[] splitFrac2 = parseString(secondFrac);
        
        int[] firstFracInt = new int[3];
        int[] secondFracInt = new int[3];
        
        for(int i = 0; i < splitFrac1.length; i++) {
        	firstFracInt[i] = Integer.parseInt(splitFrac1[i]);
        	secondFracInt[i] = Integer.parseInt(splitFrac2[i]);
        }
        
        if(firstFracInt[0] != 0) {
        	toImproperFrac(firstFracInt);
        }
        if(secondFracInt[0] != 0) {
        	toImproperFrac(secondFracInt);
        }
        
        if(operand.equals("+") || operand.equals("-")) {
        	addSubtract(firstFracInt, secondFracInt, operand);
        }else if(operand.equals("*") || operand.equals("/")) {
        	multiplyDivide(firstFracInt, secondFracInt, operand);
        }
        return "whole:" + splitFrac2[0] + " numerator:" + splitFrac2[1] + " denominator:" + splitFrac2[2];
        
        
    }
    
    public static void multiplyDivide(int[] firstFracInt, int[] secondFracInt, String operand) {
    	int numerator = 0;
    	int denominator = 0;
		if(operand.equals("*")) {
			numerator = firstFracInt[0] * secondFracInt[0];
			denominator = firstFracInt[1] * secondFracInt[1];
		}
			numerator =
	}

	public static void addSubtract(int[] firstFracInt, int[] secondFracInt, String operand) {
		
		
	}

	public static int[] toImproperFrac(int[] mixedFrac) {
    	int bigNumber = mixedFrac[0];
		int numerator = mixedFrac[1];
		int denominator = mixedFrac[2];
		int topNum = (denominator * bigNumber) + numerator;
		int[] returnArray = new int[2];
		returnArray[0] = topNum;
		returnArray[1] = denominator;
		return returnArray;
	}

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String[] parseString(String fraction) {
    	String whole = "0";
    	String numerator = "0";
    	String denominator = "1";
    	
    	if(fraction.contains("_")) {
    		String[] splitfraction = fraction.split("_");
    		whole = splitfraction[0];
    		fraction = splitfraction[1];
    	}
    	if(fraction.contains("/")) {
    		String[] splitFraction2 = fraction.split("/");
    		numerator = splitFraction2[0];
    		denominator = splitFraction2[1];
    	}
    	if(!(fraction.contains("_")) && !(fraction.contains("/" ))) {
    		whole = fraction;
    	}
    	String[] returnArray = {whole, numerator, denominator};
    	return returnArray;
    	
    }
}
