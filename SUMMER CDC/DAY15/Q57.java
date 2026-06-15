package DAY15;
import java.util.Scanner;
public class Q57 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        scn.close();
    }
}