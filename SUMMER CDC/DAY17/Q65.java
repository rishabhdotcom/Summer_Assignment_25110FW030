// Q65: Write a program to Merge arrays. 

package DAY17;
import java.util.Scanner;
public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt(); // input size as n1 in first array
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt(); // taking input of all elements of first array
        }
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt(); // input size as n2 in second array
        int[] arr2 = new int[n2]; 
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt(); // taking input of all elements of second array using a for loop
        }
        int[] merged = new int[n1 + n2]; // cre4ate a new array named merged of size n1+n2
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i]; // coppy all elementys of first array into merged array
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i]; // copy all elemnts of second array into the merged array
        }
        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " "); // display all the elemnts of merged array
        }
        sc.close();
    }
}