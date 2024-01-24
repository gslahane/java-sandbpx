/*
 * Test Arithmetic Operations
 */
public class ArithmeticOperations {     

   public static void main(String[] args) {
      int number1 = 98; // Declare an int variable number1 and initialize it to 98
      int number2 = 5;  // Declare an int variable number2 and initialize it to 5
      int sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
   
      // Perform arithmetic Operations
      sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      quotient = number1 / number2;
      remainder = number1 % number2;
  
      // Print results
      System.out.println("The sum: " +sum);  // Print description
      System.out.println("Difference:" +difference);
      System.out.println("Product:" +product);
      System.out.println("Quotient: " +quotient);
      System.out.println("Remainder:" +remainder);
     
   }
}