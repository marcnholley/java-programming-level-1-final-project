/************************************************************/
/*Program: Classes                                          */
/*CIS163AA 31892                                            */
/*Marc Holley                                               */
/*4/10/2016                                                 */
/*this program demonstrates classes                         */
/************************************************************/
import java.util.Scanner;

// Class 
public class Classes {

// main method
   public static void main(String[] args) {
      
      // constructing new Classes class
      Classes2 class1 = new Classes2();
      
      // declaring and initalizing variable(s)
      int numInput;
      
      // constructing new scanner class
      Scanner scnr = new Scanner(System.in);
      
      // prompting user for input
      System.out.println("Enter a even or odd number: ");
      numInput = scnr.nextInt();
         
         
         
      // conditional statement with logical operands
      if (numInput % 2 == 0) {
         System.out.println("Your number is even.");
         
      }
      
      // conditional statement with logical operands
      else {
         System.out.println("Your number is odd.");
      }
      
      // method class call with passby reference
      class1.positiveOrNegative(numInput);
   }

}
