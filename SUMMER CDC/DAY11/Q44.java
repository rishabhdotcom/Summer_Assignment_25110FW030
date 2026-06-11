// Q44: Write a program to Write function to find factorial.

package DAY11;
import java.util.Scanner;
public class Q44 {
    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) 
            {
            fact *= i;
            }

        return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        System.out.println("Factorial = " + factorial(num));

        scn.close();
    }
}