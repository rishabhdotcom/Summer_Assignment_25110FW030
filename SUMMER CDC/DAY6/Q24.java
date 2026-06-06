package DAY6;
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value x:- ");
        int x = sc.nextInt();
        System.out.print("Enter power value n:- ");
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.print(x);
        System.out.print("^");
        System.out.print(n);
        System.out.print(" = ");
        System.out.println(result);
        sc.close();
    }
}