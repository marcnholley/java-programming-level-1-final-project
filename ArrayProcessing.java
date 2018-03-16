/************************************************************/
/*Program: Array Processing                                 */
/*CIS163AA 31892                                            */
/*Marc Holley                                               */
/*4/10/2016                                                 */
/*this program demonstrates array processing                */
/************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

// Class 
public class ArrayProcessing {

   // method call with passby reference
   public static void positiveOrNegative (int numInput) {
      
      // declaring and intializing string array   
      String[] types = {"positive", "negative"};
      
      // conditional statements with logical operands   
      if (numInput > 0) {
         System.out.println("Your number is " + types[0]);
      }
         
      else {
         System.out.println("Your number is " + types[1]);
      }
   }
   
   public static void getNumber() {
      
      // declaring and intializing string array
      String[] types = {"even", "odd", "Invalid Number"};
      
      // declaring and initalizing variable(s)
      int numInput;
      
      // constructing new scanner class
      Scanner scnr = new Scanner(System.in);
      
      try {
      
         // prompting user for input
         System.out.println("Enter a even or odd number: ");
         numInput = scnr.nextInt();
         
         // conditional statement with logical operands
         if (numInput % 2 != 0 && numInput % 2 != 1) {
            throw new InputMismatchException("Invalid number.");
         }
      
         // conditional statement with logical operands
         if (numInput % 2 == 0) {
            System.out.println("Your number is " + types[0]);
         }
      
         // conditional statement with logical operands
         else {
            System.out.println("Your number is " + types[1]);
         }
         
         // method call with passby reference
         positiveOrNegative(numInput);
         
      }
      // catch statement recieves throw
      catch (InputMismatchException exception) {
         // outputs error messages
         System.out.println("Invalid input!");
         System.out.println("Must be an integer.");
         // recursive method call
         getNumber();
      }
   }

   // main method
   public static void main(String[] args) {      
      
      // method call
      getNumber();
      
   }

}