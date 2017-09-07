/*Marcus Wong
 * This is the runner
 * used to test the methods
 * in Calculate,java
 */
public class DoMath {
	public static void main(String args[]) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(6));
		System.out.println(Calculate.average(2,5));
		System.out.println(Calculate.average(5,3,5));
		System.out.println(Calculate.toDegrees(4));
		System.out.println(Calculate.toRadians(5));	
		System.out.println(Calculate.discriminant(5, 3, 5));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(5,2));
		
		System.out.println(Calculate.absValue(-3));
	}
}
