/*Enrico Cruz
   * 11/7/17
 + * This is FracCalc which takes in two fractions (mixed number or improper fraction)
 + * and multiply/divides/adds/or  subtracts them. Returning a simplified version.
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
     	
     	 String[] firstOperand = new String[3];
         String[] secondOperand = new String[3];
          
         splitOperands(firstOperand, answerStringOp1);
         splitOperands(secondOperand, answerStringOp2);
         
         int wholeNum1 = parseInt(answerStringOp1[0]);
         int numeratorNum1 = parseInt(answerStringOp1[1]);
         int denominatorNum1 = parseInt(answerStringOp1[2]);
         
         int wholeNum2 = parseInt(answerStringOp2[0]);
         int numeratorNum2 = parseInt(answerStringOp2[1]);
         int denominatorNum2 = parseInt(answerStringOp2[2]);
         
         int impropFrac1 = toImproperFrac(wholeNum1, numeratorNum1, denominatorNum1);
         int impropFrac2 = toImproperFrac(wholeNum2, numeratorNum2, denominatorNum2);
         int[] equation;
        		 if (operator.equals("+") || operator.equals("-")) {
        			equation=addSub(impropFrac1,improperFrac2);
        			return equation[0] + "/" + equation[1];
        		 } else {
        			 equation = multiDiv(improperFrac1,improperFrac2);
        			 return equation[0] + "/" + equation[1];
        			 
        		 }
         //return splitOperands(mathArray);
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
     public static int addSub(String operator,int num1,int num2, int den1, int den2) {
    	 int[] frac = new int[2];
 	 	frac[1] = den1 * den2;
 	 	if (operator.contains("+")) {
 	 		frac[0]= (num1*den2) + (num2*den1);
 	 } else {
 		 frac[0] = (num1*den2) - (num2*den1);
 		 return frac;
 	 	}
    }
     public static int multiDiv(String operator,int num1,int num2, int den1, int den2) {
    	 int[] frac1 = new int[2];
    	 	if (operator.contains("*")) {
    	 		frac1[0] = num1 * num2;
    	 		frac1[1] = den1 * den 2;
    	 	} else {
    	 		frac1[0] = num1 * den2;
    	 		frac1[1] = den1 * num2;
    	 		return frac1
    	 	}
     }
     public static String toImproperFrac(int whole, int numerator, int denominator) {
 		int imp= (whole * denominator) + numerator;
 		return imp + "/" + denominator;
 	}
  }


