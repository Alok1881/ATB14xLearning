package Java17_October;
import java.util.*;
public class Check_ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        while (true) {
            try {
                System.out.println("Enter length of each sides of a Triangle: ");
                side1 = sc.nextDouble();
                side2 = sc.nextDouble();
                side3 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid length of each sides");
                sc.nextLine();
            }
        }
        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2)
        {
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Invalid Triangle");
        }


    }
}
