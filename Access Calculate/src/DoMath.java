/*Enrico Cruz
 * September 26,2017
 * This is the runner class for my calculate library methods
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(4));
		System.out.println(Calculate.average(5, 1));
		System.out.println(Calculate.average2(6, 12, 8));
		System.out.println(Calculate.toDegrees((3/4) * 3.14159));
		System.out.println(Calculate.toRadians(135));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
        System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
        System.out.println(Calculate.isDivisibleBy(5,10));
        System.out.println(Calculate.absValue(-5));
        System.out.println(Calculate.max(2, 3));
        System.out.println(Calculate.maxOver(2, 5, 1));
        System.out.println(Calculate.min(8, 12));
        System.out.println(Calculate.round2(2.1234));
        System.out.println(Calculate.exponent(5, 2));   
        System.out.println(Calculate.factorial(10));
        System.out.println(Calculate.isPrime(15));
        System.out.println(Calculate.gcf(4, 16));
        System.out.println(Calculate.sqrt(3));
        
        
	}

}


