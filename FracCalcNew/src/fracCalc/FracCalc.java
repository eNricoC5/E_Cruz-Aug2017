package fracCalc;

import java.util.Scanner;

public class FracCalc {

	 public static void main(String[] args) {
         // TODO: Read the input from the user and call produceAnswer with an equation
     	Scanner userInput =new Scanner(System.in);
     	String done = "";
     	
     	do {
     	System.out.println("Enter Input: ");
         String input= userInput.nextLine();
         
     	System.out.println(produceAnswer(input));
     	
     	System.out.println("Do you want to keep going? (Type \"quit\" to end)");
     	done = userInput.nextLine();
     	
     	} while (!done.equals("quit"));
     	userInput.close();
     	}
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
    	String[] fullArray= input.split(" ");
    	String firstNum= fullArray[0];
      	String operator= fullArray[1];
      	String secondNum= fullArray[2];
        Fraction output = new Fraction();
        return output.toString();
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
