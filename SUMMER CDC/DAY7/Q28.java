package DAY7;
import java.util.Scanner;
public class Q28 {
    static int reverse = 0;
    static void reverseNumber(int n) {
        if (n == 0) {
            return;
        }
        reverse = reverse * 10 + (n % 10);
        reverseNumber(n / 10);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        reverseNumber(num);

        System.out.println("Reversed number = " + reverse);

        scn    .close();
    }
}