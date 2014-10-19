/**
*
* Prompts user to enter a value, checks if negative -- if not, prints out the square root
*
* @author <Chloe>
* @version <14/10/14>
*
*/	
import java.util.Scanner;


public class SquareRootChecker {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Please enter an integer");
      double integer = scnr.nextInt();
      

      if(integer > 0) {
         System.out.println("The square root of " + integer + " is " + Math.sqrt(integer));
         }
      else {
         System.out.println("Error, can't find square root.");
         System.out.println("Please press re-run system with a positive integer.");
         }
   }
}