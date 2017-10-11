//Marcus Wong
//October 10th, 2017
//2nd Period
/*This program contains the
 * scanners that handle user input
 * for Quadratic.java
 */


import java.util.*;

public class QuadraticClient {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer of Doom and Despair. Enter Your Numbers of Doom");
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.print("a: ");
		double a = userInput.nextDouble();
		System.out.print("b: ");
		double b = userInput.nextDouble();
		System.out.print("c: ");
		double c = userInput.nextDouble();
		System.out.println(Quadratic.quadratic(a,b,c));
		
	}
	
}
