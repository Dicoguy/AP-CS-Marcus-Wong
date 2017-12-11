//Marcus Wong
//2nd Period

package fracCalc;

import java.util.Arrays;
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
        
        improperFracOne = toImproperFrac(firstFracInt[0],firstFracInt[1],firstFracInt[2]);
        improperFracTwo = toImproperFrac(secondFracInt[0],secondFracInt[1],secondFracInt[2]);
        	
        
        int[] result = new int[2];
       
        if(operand.equals("+") || operand.equals("-")) {
        	 result = addSubtract(improperFracOne, improperFracTwo, operand);
        	 System.out.println(result[0] + " " + result[1]);
        	 return reduceFrac(result[0], result[1]);
        }else if(operand.equals("*") || operand.equals("/")) {
        	 result = multiplyDivide(improperFracOne, improperFracTwo, operand);
        	 System.out.println(result[0] + " " + result[1]);
        	 return reduceFrac(result[0], result[1]);
        	
        }else {
        	 return "not a valid operator";
        }
       
        
    }
    
    public static int[] multiplyDivide(int[] firstFracInt, int[] secondFracInt, String operand) {
    	int[] returnArray = new int[2];
    	
		if(operand.equals("*")) {
			returnArray[0] = firstFracInt[0] * secondFracInt[0];
			returnArray[1] = firstFracInt[1] * secondFracInt[1];
			
		}else {
			returnArray[0] = firstFracInt[0] * secondFracInt[1];
			returnArray[1] = firstFracInt[1] * secondFracInt[0];
		}
		
		return returnArray;
			
	}
    
	public static int[] addSubtract(int[] firstFracInt, int[] secondFracInt, String operand) {
		int[] returnArray = new int[2];
		int commonDenominator = firstFracInt[1] * secondFracInt[1];
		
		if(operand.equals("+")) {
			returnArray[0] = (secondFracInt[1] * firstFracInt[0]) + (firstFracInt[1] * secondFracInt[0]);
			returnArray[1] = commonDenominator;
		
		}else {
			returnArray[0] = (secondFracInt[1] * firstFracInt[0]) - (firstFracInt[1] * secondFracInt[0]);
			returnArray[1] = commonDenominator;
		}
		return returnArray;
	}
	
	public static int[] toImproperFrac(int whole, int numerator, int denominator) {
    	
		int[] returnArray = new int[2];
		
		if(whole != 0) {
			if(whole < 0) {
				int topNum = (denominator * whole) + -numerator;
				returnArray[0] = topNum;
				returnArray[1] = denominator;
				return returnArray;
			}
			int topNum = (denominator * whole) + numerator;
			returnArray[0] = topNum;
			returnArray[1] = denominator;
			return returnArray;
		}else {
			returnArray[0] = numerator;
			returnArray[1] = denominator;
			return returnArray;
		}
	}
	
	public static String reduceFrac(int numerator,int denominator) {
		String result = "";
		
		int gcf = gcf(numerator,denominator);
		int returnNumerator = numerator / gcf;
		int returnDenominator = denominator / gcf;
		
		
		if(numerator == 0) {
			result += 0;
			return result;
		}
		
		
		if(numerator < 0) {
			denominator = -denominator;
			numerator = -numerator;
		}
		
		
		if(returnNumerator == returnDenominator) {
			result += "1";
			return result;
		}
	
		
		if(numerator == denominator) {
			result += "1";
		}
		
		
		
		if(denominator == 1) {
			result += numerator;
			return result;
		}
		System.out.println(toMixedNum(returnNumerator, returnDenominator));
		
		if(numerator > denominator) {
			String mixedNum = toMixedNum(returnNumerator, returnDenominator);
			
			if(mixedNum.charAt(0) == '0') {
				result += mixedNum.substring(2);
				return result;
			}
			return mixedNum;
		}
		
		
		return returnNumerator + "/" + returnDenominator;
	}
	
	public static String toMixedNum(int numerator, int denominator) {
	
		String result = "";
		int bigNumber = numerator/denominator;
		numerator = numerator % denominator;
		
		if(numerator < 0 && denominator < 0) {
			numerator = -numerator;
			denominator = -denominator;
		}
		if(numerator < 0 && bigNumber < 0) {
			numerator = -numerator;
		}
		if(denominator < 0 && bigNumber < 0) {
		    denominator = -denominator;
		}
		if(numerator == 0) {
			result += bigNumber;
			return result;
		}
		if(denominator < 0 && numerator > 0) {
			denominator = -denominator;
			numerator = -numerator;
		}
		return bigNumber + "_" + numerator + "/" + denominator;
	}
	
	public static int gcf(int num1, int num2) {
		int gcf = 1;
		num1 = absValue(num1);
		num2 = absValue(num2);
		for (int i = 1; i <= min(num1, num2); i++) {
			if (isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
				if (gcf < i) {
					gcf = i;
				}
			}
		}
		return gcf;
	}
	public static int absValue(int operand) {
		if (operand < 0) {
			return -operand;
		} else {
			return operand;
		}
	}
	
	public static boolean isDivisibleBy(int firstNum, int secondNum) {
		if(secondNum == 0) {
			throw new IllegalArgumentException("Can't divide by zero.");
		}
		if(firstNum % secondNum == 0) {
			return true; 
		}else{
			return false;
		}
	}
	public static double min(int numOne, int numTwo) {
		if(numOne < numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	
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
