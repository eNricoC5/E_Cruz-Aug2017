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
	}

