public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
	String printOut = "";
	
	printOut += "Description of the graph of: \ny = " + a + "x^2" + " + " + b + "x " + c + "\n";
	if (a < 0) {
		printOut += "Opens: Down \n" ;
	} else if (a > 0) {
		printOut += "Opens: Up \n";
	} else {
		printOut += "This is not a Quadratic function \n";
	}
	String intercept= quadForm(a,b,c);
	double x= -b/2*a;
	double y= a * (x * x) + (b * x) + c;
	
	printOut +="Axis of Symmetry: " + x + "\n";
	printOut +="Vertex: (" + x + " , " + y + ")\n";
	printOut +="x-intercept: " + intercept + "\n" ;
	printOut +="y-intercept: " + c + "\n";
		return printOut;
	}
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
	public static String quadForm(double a, double b, double c) {
		if ((b * b) - 4 * a * c < 0) {
			return "no real roots";
		} else if((b * b) - 4 * a * c == 0){
            double singleRoot = round2(-b / (2 * a));
            String answer = "(" + singleRoot + " , " + "0)";
            return answer;
        }
        else{
        	double positiveQuad = round2((-b + (sqrt((b * b) - 4 * a * c))) / (2*a));
        	double negativeQuad = round2((-b - (sqrt((b * b) - 4 * a * c))) / (2*a));
        	String answer ="(" + negativeQuad + " , " + positiveQuad + ")";
        		return answer;
        }
	}
}




