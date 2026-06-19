// Q66: Write a program to Union of arrays. 

package DAY17;
import java.util.Scanner;
public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the first array: ");
        int n1 = sc.nextInt(); // size
        int[] array1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();// ALL ELEMENTS
        }
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt(); // SIZE OF N2
        int[] array2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt(); // ALL ELEMENTS
        }
        int[] union = new int[n1 + n2]; // SIZE OF UNION N1+N2
        int k = 0;
        // Add elements from first array
        for (int i = 0; i < n1; i++) {
            union[k++] = array1[i];
        }
        // Add unique elements from second array
        for (int i=0;i<n2;i++) {
            boolean found=false;
            for (int j=0;j<k;j++) {
                if (array2[i]==union[j]) {
                    found=true; // CHECK IF ELEMENT OF ARRAY 2 EXIST IN UNION
                    break;
                }
            }
            if (!found){
                union[k++] = array2[i]; // IF IT DO NOT EXISTS IN ARRAY 2 THEM ADD IT
            }
        }
        System.out.println("Union of arrays:");
        for (int i=0;i<k;i++) {
            System.out.print(union[i]+" "); // PRINT ALL ELEMNTS OF UNION
        }
        sc.close();
    }
}