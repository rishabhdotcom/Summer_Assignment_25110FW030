// Q34. Write a Java program to print the following pattern:
// 12345
// 1234
// 123
// 12
// 1

package DAY9;

public class Q34 {
    public static void main (String args[])
    {
        for (int i =1; i<=5; i++)
        {
            for (int j =1; j <=6-i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
