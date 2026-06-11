// Q41. Write a program to find the sum of two numbers using a function.

package DAY11;
import java.util.Scanner;
public class Q41 {
    // yha pr ek function banayenge jiska naam findSum hoga, aur wo do integers lega aur unka sum return karega.
    static int findSum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scn.nextInt();
        int sum = findSum(n1, n2);
        System.out.println("Sum = " + sum);
        scn.close();
    }
}