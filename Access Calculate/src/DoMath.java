/*Marcus Wong
 * This is the runner
 * used to test the methods
 * in Calculate,java
 */
public class DoMath {
	public static void main(String args[]) {
		//Part 1
		System.out.println("Part 1");
		System.out.println("Square Root: " + Calculate.square(5));
		System.out.println("Cube: " + Calculate.cube(6));
		System.out.println("average2: " + Calculate.average(2,5));
		System.out.println("average3: " + Calculate.average(5,3,5));
		System.out.println("toDegree: " + Calculate.toDegrees(4));
		System.out.println("toRadians: " + Calculate.toRadians(5));	
		System.out.println("discriminant: " + Calculate.discriminant(-5, -3, -5));
		System.out.println("toImproperFraction: " + Calculate.toImproperFrac(3, 1, 2));
		System.out.println("toMixedNumber: " + Calculate.toMixedNum(5,2));
		System.out.println("foil: " + Calculate.foil(2,3,6,-7,"n"));
		//Part 2
		System.out.println("");
		System.out.println("Part 2");
		System.out.println("isDivisibleBy: " + Calculate.isDivisibleBy(6,2));
		System.out.println("absValue: " + Calculate.absValue(-3));
		System.out.println("max2: " + Calculate.max(4,2));
		System.out.println("max3: " + Calculate.max(4,7,3));
		System.out.println("min: " + Calculate.min(4,2));
		System.out.println("round2: " + Calculate.round2(45.23237));
		//Part 3
		System.out.println("");
		System.out.println("Part 3");
		System.out.println("exponent: " + Calculate.exponent(2,2));
		System.out.println("factorial: " + Calculate.factorial(5));
		System.out.println("isPrime: " + Calculate.isPrime(5));
		System.out.println("gcf: " + Calculate.gcf(6,4));
		System.out.println("squareRoot: " + Calculate.sqrt(5));
		//Part 4
		System.out.println("QuadForm: " + Calculate.quadForm(1, 6, 1));
	}
}
