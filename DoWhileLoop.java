/*
 * Sum from a lowerbound to an upperbound using a for-loop
 */
public class DoWhileLoop {  

   public static void main(String[] args) {
      
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 10;   // Store the upperbound
      int sum = 0;  
                     
      int i = 0;
      // Use a for-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      do{

         sum = sum + i;
         i++;

      }while(i <=UPPERBOUND);

      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
   }
}