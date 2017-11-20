/*Enrico Cruz
 * 11/7/17
 * This is FracCalc which
 */
package fracCalc;

import java.util.Scanner;
import java.util.Arrays;

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
        // TODO: Implement this function to produce the solution to the input
    	String[] fullArray= input.split(" ");
    	
    	String firstNum= fullArray[0];
    	String operator= fullArray[1];
    	String secondNum= fullArray[2];

        return splitOperands(secondNum);
    }	
    public static String splitOperands(String input2) {
    	if (input2.contains("_") && (input2.contains("/"))) {
	    	String[] firstSplit = (input2.split("_"));
	    	String fW= firstSplit[0];
	    	String fFrac = firstSplit[1];
	    	String[] firstExpand = (fFrac.split("/"));
	    	String fNum = firstExpand[0];
	    	String fDen = firstExpand[1];
  
	String mixFrac = "whole:" + fW + " numerator:" + fNum + " denominator:" + fDen;

	return mixFrac;
    	}
    	else if (input2.contains ("/")) {
    		String[] firstSplit = (input2.split("/"));
    		String fNum = firstSplit[0];
    		String fDen = firstSplit[1];
    		String normFrac = "whole:" + 0 + " numerator:" + fNum + " denominator:" + fDen;
    		return normFrac;
    	} else {
    		String wholeNum = "whole:" + input2 + " numerator:" + 0 + " denominator:" + 1;
    		return wholeNum;
    	}
	}
}
