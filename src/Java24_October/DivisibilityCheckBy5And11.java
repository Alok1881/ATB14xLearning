package Java24_October;
import java.util.*;
public class DivisibilityCheckBy5And11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        while(true)
        {
            try
            {
                System.out.println("Enter number for divisibility check by 5 and 11: ");
                num=sc.nextInt();
                if(num<0)
                {
                    System.out.println("Enter correct number: ");
                    continue;
                }
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input, please enter correct input: ");
            }
        }
        if(num%5==0 && num%11==0)
        {
            System.out.println("Given number is divisible by 5 & 11 ");
        }
        else
            System.out.println("Given number is not divisible by 5 or 11");
    }
}
