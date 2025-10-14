package Java04_October;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;        // Get last digit
            rev = rev * 10 + digit;      // Append digit to reversed number
            num = num / 10;              // Remove last digit
        }

        System.out.println("Reversed Number: " + rev);

    }
}