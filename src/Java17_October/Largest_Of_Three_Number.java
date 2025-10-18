package Java17_October;
import java.util.*;
public class Largest_Of_Three_Number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        while(true)
        {
            try
            {
                System.out.println("Enter three number:");
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input,please enter correct input");
            }
        }
        if(a>b && a>c)
        {
            System.out.println("First number is greater: "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Second number is greater: "+b);
        }
        else
        {
            System.out.println("Third number is greater: "+c);
        }
    }
}
