import java.util.Scanner;

public class QuadraticClient {
public static void main(String[] args) {
	double a;
	double b;
	double c;
	String done= "";
	Scanner userInput = new Scanner(System.in);
	System.out.print("Welcome to the the Quadratic Describer \n");
	System.out.println("Provide values for coefficients a, b, and c");
	do {
	System.out.print("a: ");
	a = userInput.nextDouble();
	System.out.print("b: ");
	b = userInput.nextDouble();
	System.out.print("c: ");
	c = userInput.nextDouble();
	System.out.print("");
	
	System.out.println(Quadratic.quadrDescriber(a,b,c));
	System.out.print("");
	
	System.out.println("Do you want to keep going? (Type \"quit\" to end");
	done = userInput.next();
	} while (!done.equals("quit"));
	userInput.close();
	}
}



