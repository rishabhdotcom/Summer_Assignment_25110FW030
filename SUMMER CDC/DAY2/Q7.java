// Question 7: Write a program to find product of the digits.
package DAY2;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scn.nextInt();

        int product = 1;
        int temp = Math.abs(number);

        if (temp == 0) {
            product = 0;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }
        }

        System.out.print("Product of digits = ");
        System.out.println(product);

        scn.close();
    }
}