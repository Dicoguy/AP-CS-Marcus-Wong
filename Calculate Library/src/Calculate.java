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
		}else{
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
	//takes a double and rounds it to the tens place
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

	//raises a double to a positive integer and returns a double
	public static double exponent(double base, int power) {
		if(power) < 0) {
			throw new IllegalArgumentException("Can't do negative exponents. Sorry.");
		}else {
			for(int i = 0; i < power - 1; i++) {
				base *= base;
			}
			return base;
		}	
	}
	
	public static int factorial(int number) {
		int sum = 1;
		if(number < 0) {
			throw new IllegalArgumentException("Stop trying to break my program you can't enter negative factorials you butt");
		}else {
			for(int i = 1; i <= number; i++) {
				sum *= i;
			}
			return sum;
		}
	}
	//takes a integer and returns whether or not it is prime
	public static boolean isPrime(int number) {
		boolean prime = true;
		for(int i = 2; i < number; i++) {
			if(isDivisibleBy(number, i)) {
				prime = false;
			}
		}
		return prime;
	}
	//finds the greatest common factor(gcf) of two numbers
	public static int gcf (int numOne, int numTwo) {
		int gcf = 1;
		for (int i = 1; i <= min(numOne, numTwo); i++) {
			if (isDivisibleBy(numOne, i) && isDivisibleBy(numTwo, i)) {
				if (gcf < i) {
					gcf = i;
				}
			}
		}
		return gcf;
	}
	public static double sqrt(double number) {
		double guess = 0;
		double sqrt = 0.1;
		if(number < 0) {
			throw new IllegalArgumentException("The Square Root of" + number + "is imaginary you butt");
		}else {
			while(round2(guess*guess) != number) {
			sqrt = 0.5 * (number/guess + guess);
			guess += 0.1;
			
		}
		return round2(sqrt);
		}	
	}
}
	
