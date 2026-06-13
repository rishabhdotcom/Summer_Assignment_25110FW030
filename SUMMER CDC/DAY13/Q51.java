// Q51: Write a program to find the largest and smallest element in an array.

package DAY13;
import java.util.Scanner;
public class Q51 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of the array: "); // to enter size of array
        int n = scn.nextInt(); // n is size of array
        int[] arr = new int[n]; // to create an array of size n
        System.out.println("Enter array elements:"); // to enter array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int largest = arr[0];// initialize largest is first element of array.
        int smallest = arr[0];// initialize smallest is first element of array.

        for (int i = 1; i < n; i++) { // loop starts from 1 as first element is already assigned to largest and smallest.
            if (arr[i] > largest) {
                largest = arr[i]; // to find the largest element in the array.
            }
            if (arr[i] < smallest) {
                smallest = arr[i]; // to find the smallest element in the array.
            }
        }

        System.out.println("Largest Element = " + largest);
        System.out.println("Smallest Element = " + smallest);

        scn.close();
}
}
