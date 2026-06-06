package DAY4;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int digits = 0;
        int sum = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == originalNum) {
            System.out.print(originalNum);
            System.out.print(" is an Armstrong Number");
        } else {
            System.out.print(originalNum);
            System.out.println(" is not an Armstrong Number");
        }

        sc.close();
    }
}