package DAY7;
import java.util.Scanner;
public class Q27 {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;}
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        System.out.println("Sum of digits = " + sumOfDigits(num));
        scn.close();
    }
}