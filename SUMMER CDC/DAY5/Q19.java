// Q19. Write a program to print all factors of a number.

package DAY5;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scn.nextInt();//taking input
        System.out.print("Factors of ");
        System.out.print(num);
        System.out.println(" are:");
        //three print statement used for printing in one line.
        // using for loop to get fa tor.
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) // agar num ko i se divide karne par remainder 0 aata hai to i num ka factor hai.
                {
                System.out.print(i + ",");
                // it will print the factor + ',' 
            }
        }
        scn.close();
    }
}