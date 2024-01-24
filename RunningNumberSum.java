/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */
public class RunningNumberSum {  

   public static void main(String[] args) {
      
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 10;   // Store the upperbound
      int sum = 0;  
                     

      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            
         sum = sum + number;  // Accumulate number into sum
         number++;            // increment number
      }

      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
   }
}