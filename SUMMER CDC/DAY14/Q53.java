// Q53: Write a program to Linear search. 

package DAY14;
import java.util.Scanner;
public class Q53 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = scn.nextInt();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }
        if (position != -1)
            System.out.println("Element found at position " + (position + 1));
        else
            System.out.println("Element not found");
        scn.close();
    }
}