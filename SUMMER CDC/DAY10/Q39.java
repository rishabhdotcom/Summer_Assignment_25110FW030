// Q39. Print the following pattern:
//     1
//    121
//   12321
//  1234321
// 123454321

package DAY10;
public class Q39 {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            // is loop ke andar 3 loop chalega , ek space, ek ascending number , ek descending number ke liye.
            // Printing spaces
            for (int j = 1; j <= 5 - i; j++) // space pattern 4,3,2,1,0.
                {
                    System.out.print(" ");
                }

            // Printing ascending numbers
            for (int j = 1; j <= i; j++) // ascending number pattern print krega 1,12,123,1234,12345.
                {
                    System.out.print(j);
                }

            // Printing descending numbers
            for (int j = i - 1; j >= 1; j--) // descending number pattern print krega 0,121,12321,1234321,123454321.
                {
                    System.out.print(j);
                }

            System.out.println();
        }
    }
}