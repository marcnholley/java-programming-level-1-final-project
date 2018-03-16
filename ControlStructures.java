/************************************************************/
/*Program: Control Structures                               */
/*CIS163AA 31892                                            */
/*Marc Holley                                               */
/*4/10/2016                                                 */
/*this program demonstrates control structures              */
/************************************************************/
import java.util.Scanner;

// Class 
public class ControlStructures {

// main method
   public static void main(String[] args) {
      
      // declaring and initalizing variable(s)
      int numInput;
      
      // constructing new scanner class
      Scanner scnr = new Scanner(System.in);
      
      // prompting user for input
      System.out.println("Enter a even or odd number: ");
      numInput = scnr.nextInt();
         
         
         
         // conditional statement with logical operators
         if (numInput % 2 == 0) {
            System.out.println("Your number is even.");
         }
      
         // conditional statement with logical operators
         else
            System.out.println("Your number is odd.");
   }
}