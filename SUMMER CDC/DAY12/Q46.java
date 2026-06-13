package DAY12;
import java.util.Scanner;
public class Q46 {
    static boolean isArmstrong(int num) 
    // An Armstrong Number is a number that is equal to the sum of its digits raised to the power of the total number of digits.
    {
        int original = num;
        int sum = 0; // initialize sum is 0.
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10; // to get the last digit of the number.
            sum += Math.pow(digit, digits); // to calculate the sum of the digits raised to the power of the total number of digits.
            num /= 10; // to remove the last digit of the number and continue the loop until num becomes 0.
        }
        return sum == original; // to check if the sum is equal to the original number or not. 
       
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        if (isArmstrong(n))  // If it is equal then it is an Armstrong number otherwise it is not.
            {
            System.out.println(n + " is an Armstrong Number.");
            } 
        else {
            System.out.println(n + " is not an Armstrong Number.");
            }
        scn.close();
    }
}