package DAY5;
import java.util.Scanner;
public class Q20
// Write a program to find the largest prime factor of a given number.
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        long num = scn.nextLong();
        long largestPrimeFactor = 1;

        for (long i = 2; i * i <= num; i++) //start with 2 and check for factors until the square root of num
             {
            while (num % i == 0) {
                largestPrimeFactor = i;
                num /= i;
            }
        }

        if (num > 1) {
            largestPrimeFactor = num;
        }

        System.out.print("Largest Prime Factor = ");// print use kiya taaki same line me rhe
        System.out.println(largestPrimeFactor);

        scn.close();
    }
}