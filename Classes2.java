/************************************************************/
/*Program: Classes2                                          */
/*CIS163AA 31892                                            */
/*Marc Holley                                               */
/*4/10/2016                                                 */
/*this program demonstrates classes                         */
/************************************************************/
import java.util.Scanner;

// Class that extends the paren class
public class Classes2 extends Classes {
   
   // method with a pass by reference
   public static void positiveOrNegative (int numInput) {
      
      // conditional statement with logical operands   
      if (numInput > 0) {
         System.out.println("Your number is positive.");
      }
         
      else {
         System.out.println("Your number is negative.");
      }
   }
}