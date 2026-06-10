// Q40  : Write a program to print character pyramid .
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA
package DAY10;

public class Q40 {
    public static void main(String[] args) {
        for (char i='A'; i <= 'E'; i++) {
            // is loop ke andar 3 loop chalega , ek space, ek ascending number , ek descending number ke liye.
            // Printing spaces
            for (int j = 1; j <= 5 - (i - 'A'); j++) // space pattern 4,3,2,1,0.
                {
                    System.out.print(" ");
                }

            // Printing ascending numbers
            for (int j = 1; j <= i - 'A' + 1; j++) // ascending number pattern print krega A, AB, ABC, ABCD, ABCDE.
                {
                    System.out.print((char)('A' + j - 1));
                }

            // Printing descending numbers
            for (int j = i - 1; j >= 'A'; j--) // descending number pattern print krega 0,121,12321,1234321,123454321.
                {
                    System.out.print((char)j);
                }

            System.out.println();
        }
    }
}
