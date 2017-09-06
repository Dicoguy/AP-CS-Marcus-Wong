/*Marcus Wong
 * 9/6/17
 * 2nd Period
 * This program contains the methods needed 
 * to perform the math operations in
 * DoMath.java
 */

public class Calculate {
	public static int square(int num) {
		return num * num;
	}
	public static int cube(int cubedNum) {
		return cubedNum * cubedNum * cubedNum;
	}
	public static double average(double NumUno, double NumDos) {
		return (NumUno + NumDos) / 2;
	}
	public static double average(double numUno, double numDos, double numTres) {
		return (numUno + numDos + numTres) / 3;
	}
	public static double toDegrees(double degrees) {
		return degrees * (3.14159/180);
	}
	public static double toRadians(double radian) {
		return radian * (180/3.14159);
	}
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * (a * c)); 
	}
	public static String toImproperFrac(int bigNumber, int numerator, int denominator) {
		int topNum = (denominator * bigNumber) + numerator;
		return topNum + "/" + denominator;
	}
	public static double absValue(double number) {
		if(number < 0) {
			return -number;
		}else {
			return number;
		}
	}
}
