// Q17. Write a program to check if a number is a Perfect Number or not.

package DAY5;

import java.util.Scanner;
public class Q17 {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.print(num);
            System.out.println(" is a Perfect Number.");
        } else {
            System.out.print(num);
            System.out.println(" is not a Perfect Number.");
        }

        scn.close();
    }
}