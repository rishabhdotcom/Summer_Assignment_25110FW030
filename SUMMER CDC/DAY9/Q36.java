// Q36. Write a program to print hollow square pattern.
// *****
// *   *
// *   *
// *   *
// *****

package DAY9;
public class Q36 {
    public static void main(String[] args) {
        int n = 5; // Size of the square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    {
                        System.out.print("*");
                    } 
                else 
                    {
                        System.out.print(" ");
                    }
            }
            System.out.println();// line change krne ke liye
        
        }
    }
}