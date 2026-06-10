// Q31. Write a Java program to print the following pattern:
// A
// BB
// CCC
// DDDD
// EEEEE

package DAY9;
public class Q35 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {// row wise a se start hoga aur e tk jayega.
            for (char j = 'A'; j <= i; j++) 
                {
                    System.out.print(i);//i use kiye taaki saabhi line me same letters print ho.
                }
            System.out.println();
        }
    }
}