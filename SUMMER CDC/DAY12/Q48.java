package DAY12;
import java.util.Scanner;
public class Q48 {
    static boolean isPerfect(int n) {
        int sum = 0; //initialize sum is 0.
        for (int i = 1; i < n; i++) // loop use kr rhe to find all the divisors of n.
            {
            if (n % i == 0) // find all the divisors from n to n-1.
                {
                sum += i;// sum all the divisors.
                }
            }
        return sum == n; // to check if sum of all the divisors is same as the number entered..
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        if (isPerfect(n)) // another (for) loop use krenge to check whether the no. is perfect or not .
            {
            System.out.println(n + " is a Perfect Number.");
            } 
        else {
            System.out.println(n + " is not a Perfect Number.");
            }
        scn.close();
    }
}