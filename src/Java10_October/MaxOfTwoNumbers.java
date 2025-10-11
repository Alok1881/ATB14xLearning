package Java10_October;
import java.util.*;
public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=0;
        while(true)
        {
            try{
                System.out.println("Enter num1: \n");
                num1=sc.nextInt();
                System.out.println("Enten num2: \n");
                num2=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid number entered. please enter correct numbers");
            }
        }
        if(num1>num2)
        {
            System.out.println("num1 is max: " +num1);
        }
        else if(num2>num1)
            System.out.println("num2 is max: "+num2);
        else
            System.out.println("num1 and num2 are equal");
    }
}
