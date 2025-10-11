package Java09_October;
import java.util.*;
public class PostiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: \n");
            int num = sc.nextInt();

            if (num > 0)
                System.out.println("Positive");
            else if (num < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer only.");
        }
    }
}
