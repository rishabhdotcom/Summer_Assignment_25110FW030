// Q45: Write a program to Write function for palindrome.

package DAY12;
import java.util.Scanner;
public class Q45 {
    // palindrome a matlab hota hai ki aage se padho ya peeche se same number aana chahiye.
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) 
            {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
            }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome.");
            } 
        else {
            System.out.println(n + " is not a Palindrome.");
            }
        scn.close();
    }
}