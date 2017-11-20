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
        
        int[] improperFracOne = new int[2];
        int[] improperFracTwo = new int[2];
        
        if(firstFracInt[0] != 0) {
        	improperFracOne = toImproperFrac(firstFracInt);
        }
        if(secondFracInt[0] != 0) {
        	improperFracTwo = toImproperFrac(secondFracInt);
        }
        
        int[] result = new int[2];
        int[] multiplyDivide = new int[2];
        if(operand.equals("+") || operand.equals("-")) {
        	 result = addSubtract(improperFracOne, improperFracTwo, operand);
        	 return result[0] + "/" + result[1];
        }else if(operand.equals("*") || operand.equals("/")) {
        	 result = multiplyDivide(improperFracOne, improperFracTwo, operand);
        	 return result[0] + "/" + result[1];
        }else {
        	 return "not a valid operator";
        }
   
        
    }
    
    public static int[] multiplyDivide(int[] firstFracInt, int[] secondFracInt, String operand) {
    	int[] returnArray = new int[2];
		if(operand.equals("*")) {
			returnArray[0] = firstFracInt[0] * secondFracInt[0];
			returnArray[1] = firstFracInt[1] * secondFracInt[1];
			return returnArray;
		}else {
			returnArray[0] = firstFracInt[0] * secondFracInt[1];
			returnArray[1] = firstFracInt[1] * secondFracInt[0];
			return returnArray;
		}
			
	}

	public static int[] addSubtract(int[] firstFracInt, int[] secondFracInt, String operand) {
		int[] returnArray = new int[2];
		int commonDenominator = firstFracInt[1] * secondFracInt[1];
		if(operand.equals("+")) {
			returnArray[0] = (secondFracInt[1] * firstFracInt[0]) + (firstFracInt[1] * secondFracInt[0]);
			returnArray[1] = commonDenominator;
			return returnArray;
		}else {
			returnArray[0] = (secondFracInt[1] * firstFracInt[0]) - (firstFracInt[1] * secondFracInt[0]);
			returnArray[1] = commonDenominator;
			return returnArray;
		}
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
