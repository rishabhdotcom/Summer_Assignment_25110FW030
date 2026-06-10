// Q32. Print the following pattern:
// 1
// 22
// 333
// 4444
// 55555

package DAY8;

public class Q32 {
        public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // just only change here , replace i instead of j from Q30.
            }
            System.out.println();
        }
    }
}

