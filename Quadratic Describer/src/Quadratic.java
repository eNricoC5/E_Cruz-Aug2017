public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
	String printOut;
	
	printOut = "Description of the graph of: /ny = " + a + "x^2" + " + " + b + "x " + c;
	if (a<0) {
		printOut += "Opens: Down";
	} else if (a>0) {
		printOut += "Opens: Up";
	} else {
		printOut += "This is not a Quadratic function";
	}
	
	 return printOut; 
}
}

