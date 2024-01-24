import java.util.*;

public class JavaIO {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");  
        int a = scan.nextInt();
        System.out.print("Enter a second number: ");  
        int b = scan.nextInt();
        System.out.println("Sum of Number is: "+ (a+b) );
        

    }
}