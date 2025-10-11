package Java09_October;
import java.util.*;
public class EvenOddCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        while (true) {
            System.out.print("Enter an integer: ");
            try {
                num = sc.nextInt();   // Try to read an integer
                break;                // Exit loop if successful
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a valid integer.");
                sc.nextLine();        // Clear the invalid input from scanner buffer
            }
        }
        if(num%2==0)
        {
            System.out.println("given number is Even: "+num);
        }
        else
            System.out.println("given number is Odd: "+num);

    }
}
