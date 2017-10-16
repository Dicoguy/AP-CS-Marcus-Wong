//Marcus Wong
//October 10th, 2017
/* This program contains the various functions
 * needed to describe the quadratic graph of the 
 * values gained in QuadraticClient
 */

public class Quadratic {
	public static String quadratic(double a, double b, double c) {
		String answer = "";
		String description = "Description of the Graph is: \n";
		String equation = "y = " + a + " x^2 + " + b + " x + " + c;
		answer += description + equation + "\n\n";
		
		if(a < 0) {
			answer += "Opens: Down \n";
		}
			answer += "Opens: Up \n";
		String axis = "Axis of Symmetry: ";	
		double AOS = round2((-b / (2 * a)));
		answer += axis + AOS + "\n";
		
		double vertex = round2(((a * (AOS * AOS)) + (b * AOS) + c));
		answer += "Vertex: <" + AOS + "," + vertex + "> \n";
		
		//String roots = quadForm(a, b, c);
		//answer += "x-intercepts<s>: " + roots + "\n";
		
		answer += "y-intercept: " + c + "\n";
		return answer;
	}
	public static String quadForm(double a, double b, double c) {
		String answer = "";
		double discr = discriminant(a,b,c);
		double rootOne = round2((((-b) + sqrt(discr)) / (2*a)));
		double rootTwo = round2((((-b) - sqrt(discr)) / (2*a)));
		if(discr < 0){
			return "no real roots";
		}else if(rootOne == rootTwo) {
			answer = answer + rootOne;
		}else{
			answer = answer + min(rootOne, rootTwo) + " and " + max(rootOne, rootTwo);
		}
		return answer;
	}
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * (a * c)); 
	}
	
	public static double max(double numOne, double numTwo) {
		if(numOne > numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	public static double min(double numOne, double numTwo) {
		if(numOne < numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	
	public static double sqrt(double number) {
		double guess = 0;
		double sqrt = 0.1;
		if(number < 0) {
			throw new IllegalArgumentException("The Square Root of" + number + " is imaginary, what a travesty");
		}else {
			while(round2(sqrt*sqrt) != number) {
			sqrt = 0.5 * (number/guess + guess);
			guess += 0.1;
		}
		return round2(sqrt);
		}	
	}
	public static double round2(double decimal) {
		double thousand = decimal * 100;
		double lastNum = thousand % 1;
		if(thousand > 0) {
			if(thousand % 1 >= 0.5) {
				thousand = thousand + 1;
			}
			thousand = thousand - lastNum;
		}else {
			if(lastNum <= -0.5) {
			     	thousand = thousand - 1;
			}
			thousand = thousand - lastNum;
		}	
		thousand = thousand / 100;
		return thousand;
	}	
}
