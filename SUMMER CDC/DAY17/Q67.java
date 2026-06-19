// Q67: Write a program to Intersection of arrays. 

package DAY17;
import java.util.Scanner;
public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1: ");
        int n1 =sc.nextInt();
        int[] array1 =new int[n1];
        System.out.println("Enter elements of 1:");
        for (int i =0;i <n1;i++) {
            array1[i] =sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n2 =sc.nextInt();
        int[] array2 =new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i= 0;i< n2;i++) {
            array2[i] =sc.nextInt();
        }
        System.out.println("Intersection of arrays:");
        for (int i = 0; i < n1; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (array1[i] == array1[k]) {
                    alreadyPrinted = true;
                    break;
                }
                }if (alreadyPrinted)
                continue;
            for (int j = 0; j < n2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}