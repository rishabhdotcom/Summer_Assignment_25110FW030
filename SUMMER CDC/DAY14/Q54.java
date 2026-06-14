// Q54: Write a program to Frequency of an element. 

package DAY14;
import java.util.Scanner;
public class Q54 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter element to find frequency: ");
        int key = scn.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Frequency of " + key + " = " + count);
        scn.close();
    }
}