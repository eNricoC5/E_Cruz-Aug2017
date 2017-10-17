import java.util.Scanner;

public class QuadraticClient {
public static void main(String[] args) {
	double a;
	double b;
	double c;
	String done;
	Scanner userInput = new Scanner(System.in);
	System.out.print("Welcome to the the Quadratic Describer");
	System.out.print("Provide values for coefficients a, b, and c");
	do {
	System.out.print("Whats your value for a: ");
	a = userInput.nextDouble();
	System.out.print("Whats your value for b: ");
	b = userInput.nextDouble();
	System.out.print("Whats your value for c: ");
	c = userInput.nextDouble();
	
	System.out.println(quadrDescriber(a,b,c));
	System.out.println("Are you done? Type \"yes\" if you're done.");
	} while (done != "yes");
	userInput.close();
	}
}

