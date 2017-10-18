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
		boolean quit = false;
		Scanner userInput = new Scanner(System.in);
		do {
		System.out.println("Welcome to the Quadratic Describer. Enter Your Numbers");
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.print("a: ");
		double a = userInput.nextDouble();
		System.out.print("b: ");
		double b = userInput.nextDouble();
		System.out.print("c: ");
		double c = userInput.nextDouble();
		System.out.println(Quadratic.quadratic(a,b,c));
		System.out.println("Do you want to keep going? <Type \"quit\" to end>");
		String check = userInput.next();
		if(check.charAt(0) == ('q')) {
			quit = true;
		}
		}while(!quit);	
	}
}
