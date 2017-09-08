/*Marcus Wong
 * 9/6/17
 * 2nd Period
 * This program contains the methods needed 
 * to perform the math operations in
 * DoMath.java
 */

public class Calculate {
	//takes an integer and squares it
	public static int square(int num) {
		return num * num;
	}
	//takes an integer and cubes it
	public static int cube(int cubedNum) {
		return cubedNum * cubedNum * cubedNum;
	}
	//takes two doubles and averages them
	public static double average(double NumUno, double NumDos) {
		return (NumUno + NumDos) / 2;
	}
	//takes THREE doubles and averages them
	public static double average(double numUno, double numDos, double numTres) {
		return (numUno + numDos + numTres) / 3;
	}
	//converts a degree value to radians
	public static double toDegrees(double degrees) {
		return degrees * (3.14159/180);
	}
	//converts
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
	public static String toMixedNum(int numerator, int denominator) {
		int bigNumber = numerator/denominator;
		numerator = numerator % denominator;
		return bigNumber + "_" + numerator + "/" + denominator;
	}
	public static String foil(int a, int b, int c, int d, String x) {
		int firstNum = a * c;
		int secondNum = (a*d) + (b*c);
		int thirdNum = b*d;
		return firstNum + x + "^2 + " + secondNum + x + " + " + thirdNum;
	}
	public static void Boolean(int firstNum, int secondNum) {
		
	}
		
	
	public static double absValue(double number) {
		if(number < 0) {
			return -number;
		}else {
			return number;
		}
	}
}
