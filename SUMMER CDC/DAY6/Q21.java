package DAY6;

// Q21. Write a program to convert a decimal number to binary.
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }
}