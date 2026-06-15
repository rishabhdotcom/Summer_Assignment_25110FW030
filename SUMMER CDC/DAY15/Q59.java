package DAY15;
import java.util.Scanner;
public  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt( );
        }
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println("Array after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }
}