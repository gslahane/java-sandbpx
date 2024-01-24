/*
 * Sum from a lowerbound to an upperbound using a for-loop
 */
public class ForLoop {  

   public static void main(String[] args) {
      
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 10;   // Store the upperbound
      int sum = 0;  
                     

      // Use a for-loop to repeatedly sum from the lowerbound to the upperbound
      for(int i=LOWERBOUND; i <=UPPERBOUND; i++) {

         sum = sum + i;

      }

      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
   }
}