// Q31. Write a Java program to print the following pattern:
// A
// AB
// ABC
// ABCD
// ABCDE

package DAY8;
public class Q31 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}