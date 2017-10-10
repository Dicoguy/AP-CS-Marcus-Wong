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
		String axis = "Axis of Symmetry:";	
		double AOS = (-b / (2 * a));
		answer += axis + AOS + "\n";
		
		double vertex = ((a * (AOS * AOS)) + (b * AOS) + c);
		answer += "<" + AOS + "," + vertex + "> \n";
		
		return answer;
	}
}
