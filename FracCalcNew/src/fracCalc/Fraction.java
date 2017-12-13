
package fracCalc;

public class Fraction {
	private int numerator;
	private int denominator;
	private int whole;
	private char sign;
	
	public Fraction(String input) {
		  String[] equation = input.split(" ");
	      String firstFrac = equation[0];
	      String operand = equation[1];
	      String secondFrac = equation[2];
	      String[] splitFrac1 = parseString(firstFrac);
	      String[] splitFrac2 = parseString(secondFrac);
	      
	}
	
	private String[] parseString(String fraction) {
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
