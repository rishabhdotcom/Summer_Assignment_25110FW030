// Q23. Write a program to count the number of set bits in a number.

package DAY6;
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
// while loop use krenge , jab tak num 0 se bada hai, tab tak loop chalta rahega.
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }

        System.out.print("Number of set bits = ");
        System.out.println(count);

        sc.close();
    }
}