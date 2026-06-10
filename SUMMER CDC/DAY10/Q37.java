// Q37. Print the following pattern:
//     *
//    ***
//   *****
//  *******
// *********

package DAY10;
public class Q37 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // Printing spaces
            for (int j=1;j<=5-i;j++) 
                {
                    System.out.print(" ");
                }

            // Printing stars
            for (int k=1;k<=(2*i-1);k++) 
                {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}