import java.util.Scanner;
public class Q1 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the N: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Sum of the first " + n + " natural numbers = " + sum);

        sc.close();
    }
}