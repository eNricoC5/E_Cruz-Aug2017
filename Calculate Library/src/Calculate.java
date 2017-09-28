/* Enrico Cruz
 * September 5, 2017
* This is our home grown library that will contain various
*mathematical methods.
*/
public class Calculate {
/* This method takes an integer and returns its square
 */
	public static int square(int operand) {
		int s= operand * operand;
		return s;
	}
	/* This method takes an integer and returns it a square
	 */
	public static int cube(int operand) {
		int q= operand * operand * operand;
		return q;
	}
	/* This method takes an integer and cubes it
	 */
	public static double average(double operand, double operand2) {
		double ave= (operand + operand2)/2;
		return ave;
	}
	/* This method takes in 2 doubles and averages the two 
	 */
	public static double average2(double operand, double operand2, double operand3) {
		double ave2= (operand + operand2 + operand3)/3;
		return ave2;
	}
	/* This method takes in 3 doubles and averages the 3
	 */
	public static double toDegrees(double operand) {
		double Degrees= (operand * (3.14159/180));
		return Degrees;
	}
	/* This method takes in a double of a radian and converts it
	 * to a degree
	 */
	public static double toRadians(double operand) {
		double Radians= (operand * (180/3.14159));
		return Radians;
	}
	/*This method takes in a double of a degree and conerts it
	 * to a radian
	 */
	public static double discriminant(double operand, double operand2, double operand3) {
		double dis= operand + operand2 + operand3;
		return dis;
	}
	/*This method takes in three doubles and returns a double to represent a,b, and c
	 * in the discriminant y=ax^2+bx+c 
	 */
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		int imp= (whole * denominator) + numerator;
		return imp + "/" + denominator;
	}
	/*This method takes in a mixed number (3 int) and returns an improper (1 int)
	 */
	public static String toMixedNum(int num, int den) {
		int mix= num / den;
		int frac= num % den;
		return mix + "_" + frac + "/" + den;
	}
	/*This method takes in an improper fraction (2 int) and returns and mixed numbers (3 int)
	 */
	public static String foil(int a, int b, int c, int d, String e) {
		int firstCoef= a * c;
		int secondCoef= a * d + b * c;
		int constantNum= b * d;
		String quad= firstCoef + e + "^2 + " +secondCoef + e + " " + constantNum;
		return quad;
	}
	/*This method takes in 4 integers and one string to use foil of a factored polynomial
	 * to simplify it to one whole polynomial
	 */
	public static boolean isDivisibleBy(int a, int b) {
		int Division = a / b;
		if (Division );
		System.out.println("True.");
	} else { 
		System.out.println("False.");
	}
	/*This method takes in two integers and returns a boolean
	 * to determine whether or no the two can be divided evenly
	 */
	public static double absValue(double x) {
		if (x >= 0) {
		return x;
		} else { 
		System.out.println(x * -1);
		}
	}
	/*This method takes in a double and returns a double of its absolute value
	 */
	public static double max(double a, double b) {
		if (a >= b) {
		return a;
		} else {
		return b;
		}
	}
	/*This method takes in two doubles and determines the max of the two doubles
	 * which otherwise returns the larger double
	 */
	public static double maxOver(double a, double b, double c) {
		if (a >= b) {
			return a;
		} else if (b >= c) {
			return b;
		} else if (a >= c) {
			return a;
		} else if (c >= a) {
			return c;
		}
	}
	/* This method overloads max and takes in three doubles and returns 
	 * the one with the greatest value
	 */
	public static int min( int a, int b) {
		if (a <= b) {
			return a;
		} else {
			return b;
		}
	}
	/* This method takes in two integers and returns the smallest of the two 
	 */
	public static double round2(double x) {
			double end = 0.0;
			int intT = (int)(x * 1000);
			int numR= intT % 10;
			intT = intT / 10;
			if (numR >= 5 && intT > 0)
				intT++;
			else if(numR <= -5 && intT < 0)
				intT--;
			end = intT / 100.0;
			return end;
		}
	/* this integer takes in one double and rounds it two decimal places to give a double
	 */
	public static double exponent(double x, int y) {
		double exp = y * (x * x);
		return exp;
		}
	/* This method takes in a double and an integer and returns a double.
	 * It's purpose is to take the double and raise to the power of the positive integer.
	 */
	public static int factorial(int a) {
		int multiply= 1;
		if (multiply == 0) {
			return multiply;
		}
		for(int i = 1; i <= a; i++)	{
			multiply *=i;
		}
		return multiply;
}
	/*This takes in an integer and returns an integer to give its factorial
	 */
	public static boolean isPrime(int a) {
		int start = 2
				for(isDivisbleBy.) {
					
				}
	}
	}




