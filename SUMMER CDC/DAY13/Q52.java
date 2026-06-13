// Q52: Write a program to Count even and odd elements.

package DAY13;
import java.util.Scanner;
public class Q52 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: "); //size of the array
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:"); //elements of arrray
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); //loop for taking input
        }
        int even = 0; //initialize even
        int odd = 0; // initialize odd
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) 
                { //if divisible by 2 then increase the count of even terms
                even++;
                } 
            else { // else increase the count of odd terms.
                odd++;
            }
        }
        System.out.println("Number of Even Elements = " + even);
        System.out.println("Number of Odd Elements = " + odd);
        scn.close();
    }
}