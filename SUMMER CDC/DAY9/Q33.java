// Q33. Write a Java program to print the following pattern:
// * * * * *
// * * * *
// * * *
// * *
// *

package DAY9;

public class Q33 {
    public static void main(String[] args) {
        for( int i =1; i<=5; i++){
            for ( int j =1; j<=(6-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
