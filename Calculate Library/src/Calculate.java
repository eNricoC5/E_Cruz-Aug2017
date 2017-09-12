/* Enrico Cruz
 * September 5, 2017
* This is our home grown library that will contain various
*mathematical methods.
*/
public class Calculate {
/* This method takes an integer and returns its square
 */
	public static int square(int operand) {
		int square= operand * operand;
		return square;
	}
	/* This method takes an integer and returns it a square
	 */
	public static int cube(int operand) {
		int cube= operand * operand * operand;
		return cube;
	}
	/* This method takes an integer and cubes it
	 */
	public static double average(double operand, double operand2) {
		double average= (operand + operand2)/2;
		return average;
	}
	/* This method takes in 2 doubles and averages the two 
	 */
	public static double average2(double operand, double operand2, double operand3) {
		double average2= (operand + operand2 + operand3)/3;
		return average2;
	}
	/* This method takes in 3 doubles and averages the 3
	 */
	public static double toDegrees(double operand) {
		double toDegrees= (operand * (3.14159/180));
		return toDegrees;
	}
	/* This method takes in a double of a radian and converts it
	 * to a degree
	 */
	public static double toRadians(double operand) {
		double toRadians= (operand * (180 * 3.14159));
		return toRadians;
	}

 }
