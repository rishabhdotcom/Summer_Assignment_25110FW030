package DAY15;
import java.util.Scanner;
public class Q58 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:-");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int frst = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = frst;
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }
}