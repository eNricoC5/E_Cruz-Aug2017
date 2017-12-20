package fracCalc;

public class Fraction {

	private int whole;
	private int numerator;
	private int denominator;
	
	public Fraction(String input) {
		whole = 0;
		numerator = 0;
		denominator = 1;
	splitOperands(input);
	return;
	}
	public void splitOperands(String input2) {
		if(input2.contains("_") && input2.contains("/")) {
			String[] array = input2.split("_");
			whole = Integer.parseInt(array[0]);
			String fraction = array[1];
			String[] pieceOfFrac = fraction.split("/");
			numerator = Integer.parseInt(pieceOfFrac[0]);
			denominator = Integer.parseInt(pieceOfFrac[1]);
		} else if (input2.contains("/")) {
			whole = 0;
			String[] pieceOfFrac= input2.split("/");
			numerator = Integer.parseInt(pieceOfFrac[0]);
			denominator = Integer.parseInt(pieceOfFrac[1]);
		} else {
			whole = Integer.parseInt(input2);
		
		}
	}
}