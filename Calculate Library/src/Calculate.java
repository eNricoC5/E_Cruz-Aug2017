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
	/*This method takes in a double of a degree and converts it
	 * to a radian
	 */
	public static double discriminant(double a, double b, double c) {
		double dis= (b * b) - 4 * a * c;
		return dis;
	}
	/*This method takes in three doubles and returns a double to represent a,b, and c
	 * and return b^2 - 4ac
	 */
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		int imp= (whole * denominator) + numerator;
		return imp + "/" + denominator;
	}
	/*This method takes in a mixed number (3 integer) and returns an improper (1 integer)
	 */
	public static String toMixedNum(int num, int den) {
		int mix= num / den;
		int frac= num % den;
		return mix + "_" + frac + "/" + den;
	}
	/*This method takes in an improper fraction (2 integer) and returns and mixed numbers (3 integer)
	 */
	public static String foil(int a, int b, int c, int d, String e) {
		int FirstCoef = a * c;
				int secondCoef =  a * d + b * c;
				int constantNum = b * d;
				String quad = FirstCoef + e +"^2 + " +secondCoef + e + " " + constantNum; 
				return quad;
	}
	/*This method takes in 4 integers and one string to use foil of a factored polynomial
	 * to simplify it to one whole polynomial
	 */
	public static boolean isDivisibleBy(int a, int b) {
		if (a%b == 0) {
		return true;
	} else { 
		return false;
	}
	}
	/*This method takes in two integers and returns a boolean
	 * to determine whether or not the two can be divided evenly
	 */
	public static double absValue(double x) {
		if (x >= 0) {
		return x;
		} else { 
		return-x;
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
		double maximum = a;
        if(b > a){
            maximum = b;
        }
        if(c > b){
            maximum = c;
        }
        return maximum;
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
		double endValue = 0.0;
		
		int intT= (int)(x * 1000);
		int num = intT % 10;
		intT = intT / 10;
		if (num >= 5 && intT > 0)
			intT++;
		else if(num <= -5 && intT < 0)
			intT--;
		endValue = intT / 100.0;
		return endValue;
 }
	/* This method takes in a double and rounds it two places 
	 */
	 public static double exponent(double num, int numPow){
         double product = 1;
         for(int i = 0; i < numPow; i++){
             product *= num;
         }
         return product;
     }
	 /*This  takes in a double and an int and returns a double
	  * The loop takes in vaules for the exponent and plugs them in to the power of the base
	  */
	public static int factorial(int x) {
		int multiply= 1;
		if (multiply == 0) {
			return multiply;
		}
		for(int i = 1; i <= x; i++)	{
			multiply *=i;
		}
		return multiply;
	}
	/*
	 * 
	 */
	public static boolean isPrime(int integer) {
		for(int i = 2; i< integer; i++) {
			if (isDivisibleBy(integer,i)) {
				return false;
			}
		} 
			return true;
	}
			/*This method takes in a integer and returns a boolean to determine 
			 * if a number is prime (true) or if its not (false).
			 */
	public static int gcf(int a, int b) {
		int i = min(a,b);
		while(i>= 1) {
			if((a % i == 0) && (b % i == 0)) {
				return i;
			} 
			i--;
		}
		return 1;
		}
	
	 /*This takes in two integers and returns an integer
	  * the method takes the numbers and determines its greatest common factor
	  */
	 public static double sqrt(double num) {
		 double a;
		 if (num< 0) {
			 throw new IllegalArgumentException("Do not accept negative numbers");
		 }
		 double squared = num / 2;
		 
			do {
				a = squared;
				squared = (a + (num / a)) / 2;
			} while ((a - squared) != 0);
		 
			return round2(squared);
		}
	 /*this method takes in a double and returns a double
	  * The point is to take in a number and return a squared version of it
	  */
	public static String quadForm(int a, int b, int c) {
		if (discriminant(a,b,c) < 0) {
			return "no real roots";
		} else if(discriminant(a, b, c) == 0){
            double singleRoot = round2(-b / (double)(2 * a));
            String answer = "(" + singleRoot + " , " + "0)";
            return answer;
        }
        else{
        	double positiveQuad = round2((-b + (sqrt(discriminant(a,b,c)))) / (2*a));
        	double negativeQuad = round2((-b - (sqrt(discriminant(a,b,c)))) / (2*a));
        	String answer ="(" + negativeQuad + " , " + positiveQuad + ")";
        		return answer;
        }
	}
}




