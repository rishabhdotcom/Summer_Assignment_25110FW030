package DAY3;
import java.util.Scanner;
public class que12 {
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = scn.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);

        scn.close();
    }
}