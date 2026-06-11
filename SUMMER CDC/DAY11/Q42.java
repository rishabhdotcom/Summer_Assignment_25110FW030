// Q42 : Write a Java program to find the maximum of two numbers using a function.


package DAY11;
import java.util.Scanner;
public class Q42 {
        // yha pr ek function banayenge jiska naam Max hoga, aur wo do integers lega aur unme se maximum return karega.
            static int Max(int a, int b) 
            {
                if (a > b)
                   return a;
                else
                   return b;
            }
             public static void main(String[] args) 
             {
                Scanner scn = new Scanner(System.in);

                System.out.print("Enter first number: ");
                int num1 = scn.nextInt();

                System.out.print("Enter second number: ");
                int num2 = scn.nextInt();

                int max = Max(num1, num2);

        System.out.println("Maximum number = " + max);

        scn.close();
    }
}