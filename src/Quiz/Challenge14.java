package Quiz;
import java.util.*;
public class Challenge14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();  // pattern size

        System.out.println("\n--- Right Triangle Pattern ---");
        printRightTriangle(n);

        System.out.println("\n--- Pyramid Pattern ---");
        printPyramid(n);

        sc.close();
    }

    // Method to print Right Triangle Pattern
    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {           // outer loop for rows
            for (int j = 1; j <= i; j++) {       // inner loop for stars
                System.out.print("* ");
            }
            System.out.println();                // new line after each row
        }
    }

    // Method to print Pyramid Pattern
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {               // outer loop for rows
            for (int j = i; j < n; j++) {            // print leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // print stars
                System.out.print("*");
            }
            System.out.println();                    // move to next line
        }
    }

}
