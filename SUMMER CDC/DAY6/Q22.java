// Q22. Write a program to convert a binary number to decimal.

package DAY6;
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}