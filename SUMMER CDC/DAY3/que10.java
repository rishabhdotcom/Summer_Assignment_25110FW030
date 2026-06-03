package DAY3;
import java.util.Scanner;
public class que10 {
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scn.nextInt();

        System.out.print("Enter ending number: ");
        int end = scn.nextInt();

        System.out.println("Prime numbers between ");
        System.out.println(start);
        System.out.println(" and " );
        System.out.println(end);
        System.out.println(" are:");

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        scn.close();
    }
}