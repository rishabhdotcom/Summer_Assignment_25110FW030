package DAY13;
import java.util.Scanner;
public class Q49 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();// n is size of array
        int[] arr = new int[n];
        // entering  array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // Displaying array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }
}