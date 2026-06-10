// Q38. Write a program to print reverse star pyramid:
// *********
//  *******
//   *****
//    ***
//     *

package DAY10;
public class Q38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // Printing spaces
            for (int j=1;j<=i-1;j++) 
                {
                    System.out.print(" "); // increasing space pattern 0,1,2,3,4.
                }

            // Printing stars
            for (int k=9;k>=(2*i-1);k--) // decresing star pattern 9,7,5,3,1.
                {
                    System.out.print("*");
                }

            System.out.println();// line change krne ke liye
        }
    }
}