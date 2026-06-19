// Q68: Write a program to Find common elements. 

package DAY17;
import java.util.Scanner;
public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt(); // size of 1 array
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt(); // elements of first array
        }
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt(); // size of sec. array
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();// elements of second array
        }
        System.out.println("Common elements are:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) // check if element of first is same as second {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}