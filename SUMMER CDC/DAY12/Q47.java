package DAY12;
import java.util.Scanner;
public class Q47 
{
    static int fibonacci(int n) // fibonacci series me each term is the sum of the previous two terms.
    // The first two terms of the series are 0 and 1.
    {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;// this 0 and 1 is the first two terms of the series.
        int a = 0, b = 1, c = 0; // from here the loop start 
                                 // the next term of the loop will sum up the previous two terms and store it in c
                                 // and them a and b will be updated for the next two terms.
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();
        System.out.println("Fibonacci term = " + fibonacci(n)); // this will print the nth term of the fibonacci series.
        scn.close();
    }
}