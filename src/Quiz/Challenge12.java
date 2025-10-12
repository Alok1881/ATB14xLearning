package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                System.out.println("Enter value of n: \n");
                n = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("invalid input, Enter integer value for n: ");
            }

        }
        int fact = 1;
        if (n == 0 || n == 1)
            System.out.println(fact);
        while(n>1)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial is: "+fact);
    }
}
