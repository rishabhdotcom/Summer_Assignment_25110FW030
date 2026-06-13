// Q50: Write a program to Find sum and average of array.

package DAY13;
import java.util.Scanner;
public class Q50 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt(); // n is sieze of array   
        int[] arr = new int[n];
        int sum = 0;// initialize sum is 0.
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
            {
            arr[i] = scn.nextInt();
            sum += arr[i];
            }
        double average = (double) sum / n; // double type is used as average will be decimal value.

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scn.close();
    }
}