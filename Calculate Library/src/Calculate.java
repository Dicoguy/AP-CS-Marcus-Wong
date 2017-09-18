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
	//converts a radian value to degrees
	public static double toDegrees(double degrees) {
		return degrees * (3.14159/180);
	}
	//converts a degree value to radians
	public static double toRadians(double radian) {
		return radian * (180/3.14159);
	}
	//calculates the discrimant when given the values
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * (a * c)); 
	}
	//concerts a mixed number to an improper fraction
	public static String toImproperFrac(int bigNumber, int numerator, int denominator) {
		int topNum = (denominator * bigNumber) + numerator;
		return topNum + "/" + denominator;
	}
	//converts an improper fraction to a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		int bigNumber = numerator/denominator;
		numerator = numerator % denominator;
		return bigNumber + "_" + numerator + "/" + denominator;
	}
	//converts a binomial multiplication form to the standard form
	public static String foil(int a, int b, int c, int d, String x) {
		int firstNum = a * c;
		int secondNum = (a*d) + (b*c);
		int thirdNum = b*d;
		return firstNum + x + "^2 + " + secondNum + x + " + " + thirdNum;
	}
	//checks to see if one integer is evenly divisible by the other
	public static boolean isDivisibleBy(int firstNum, int secondNum) {
		if(firstNum % secondNum == 0) {
			return true; 
		}else {
			return false;
		}
	}
	//compares two values and returns the bigger one
	public static double max(double numOne, double numTwo) {
		if(numOne > numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	//compares three values and returns the biggest one
	public static double max(double numOne, double numTwo, double numThree) {
		double answer = 0;
		if(numOne > numTwo && numOne > numThree) {
			answer = numOne;
		}else if(numTwo > numOne && numTwo > numThree){
			answer = numTwo;
		}else if(numThree > numOne && numThree > numTwo) {
			answer = numThree;
		}
		return answer;
	}
	//compares two values and returns the smaller value
	public static double min(double numOne, double numTwo) {
		if(numOne < numTwo) {
			return numOne;
		}else {
			return numTwo;
		}
	}
	//returns the absolute value of the given number
	public static double absValue(double number) {
		if(number < 0) {
			return -number;
		}else {
			return number;
		}
	}
	public static double round2(double decimal) {
		double thousand = decimal * 100;
		int lastNum = thousand % 10;
		if(thousand > 0) {
			if(thousand % 10 >= 5) {
				thousand = thousand - lastNum;
				thousand = thousand + 10;
				thousand = thousand / 1000;
			}
		}else {
			if(thousand % 10 <= 5) {
				thousand = thousand - lastNum;
				thousand = thousand - 10;
				thousand = thousand / 1000;
			}
		return thousand;
	}
	}
	//raises a double to a positive int and returns a double
	public static double exponent(double base, int power) {
		for(int i = 0; i < power - 1; i++) {
			base *= base;
		}
		return base;
	}
	
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 1; i <= number; i++) {
			sum *= i;
		}
		return sum;
	}
	
	
