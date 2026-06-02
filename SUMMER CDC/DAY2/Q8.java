// Question 8: Write a program to check whether the number is palindrome or not.
package DAY2;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
// apply the if else condition to check.
        if (original == reverse) {
            System.out.print(original);
            System.out.println(" is a Palindrome Number.");
        } else {
            System.out.print(original);
            System.out.println(" is not a Palindrome Number.");
        }

        scn.close();
    }
}