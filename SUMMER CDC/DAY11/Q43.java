// Q43: Write a Java program to check if a number is prime or not.

package DAY11;
import java.util.Scanner;
public class Q43 {

    static boolean isPrime(int n) 
    {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if (isPrime(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

        scn.close();
    }
}