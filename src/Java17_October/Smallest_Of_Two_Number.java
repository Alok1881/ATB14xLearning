package Java17_October;
import java.util.*;
public class Smallest_Of_Two_Number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        while(true)
        {
            try
            {
                System.out.println("Enter two number: ");
                a=sc.nextInt();
                b=sc.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("invalid input,please enter correct input");
                sc.nextLine();
            }
        }
        if(a<b)
        {
            System.out.println("First number is smaller: "+a);
        }
        else
        {
            System.out.println("Second number is smaller: "+b);
        }
    }
}
