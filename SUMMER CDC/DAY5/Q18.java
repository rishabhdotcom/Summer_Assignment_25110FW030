package DAY5 ;
// Q18. Write a program to check if a number is a Strong Number or not.


import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        int a= n;
        int sum = 0;

        while (a > 0) {
            int digit = a % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) 
                {
                fact *= i;
            }
            sum += fact;
            a /= 10;
        }
        if (sum == n) {
            System.out.print(n);
            System.out.println(" is a Strong Number");
        } else {
            System.out.print(n);
            System.out.println(" is not a Strong Number");
        }
        scn.close();
    }
}