package DAY2;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        // enter the number whose digits you want to sum
        int num = scn.nextInt();

        int sum = 0;
        int temp = Math.abs(num); 
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Sum of digits = ");
        System.out.println(sum);

        scn.close();
    }
}