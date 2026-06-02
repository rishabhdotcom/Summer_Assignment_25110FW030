// Question 2 : Write a program to reverse a number.
package DAY2;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        // Take the input of the number
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.print("Reversed number = ");
        System.out.println(reverse);


        sc.close();
    }
}
