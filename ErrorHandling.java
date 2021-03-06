/************************************************************/
/*Program: Error Handling                                   */
/*CIS163AA 31892                                            */
/*Marc Holley                                               */
/*4/10/2016                                                 */
/*this program demonstrates error handling                  */
/************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

// Class 
public class ErrorHandling {

   // method with a passby reference
   public static void positiveOrNegative (int numInput) {
      
      // conditional statement with logical operands
      if (numInput > 0) {
         System.out.println("Your number is positive.");
      }
         
      else {
         System.out.println("Your number is negative.");
      }
   }

   // main method
   public static void main(String[] args) {      
      
      // declaring and initalizing variable(s)
      int numInput;
      
      // constructing new scanner class
      Scanner scnr = new Scanner(System.in);
      
      try {
      
         // prompting user for input
         System.out.println("Enter a even or odd number: ");
         numInput = scnr.nextInt();
         
         if (numInput % 2 != 0 && numInput % 2 != 1) {
            throw new InputMismatchException("Invalid number.");
         }
      
         // conditional statement with logical operands
         if (numInput % 2 == 0) {
            System.out.println("Your number is even.");
         }
      
         // conditional statement with logical operands
         else {
            System.out.println("Your number is odd.");
         }
         // method call with passby reference
         positiveOrNegative(numInput);
         
      }
      // catch statement recieves throw
      catch (InputMismatchException exception) {
         // outputs error messages
         System.out.println("Invalid input!");
         System.out.println("Must be an integer.");
      }
   }
}