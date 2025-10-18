package Java17_October;
import java.util.*;
public class Smallest_Of_Three_Numbers {
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
                System.out.println("Enter Three number: ");
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input, please enter correct input: ");
                sc.nextLine();
            }
        }
        if(a<b && a<c)
        {
            System.out.println("First number is smaller: "+a);
        }
        else if(b<a && b<c)
        {
            System.out.println("Second number is smaller: "+b);
        }
        else
            System.out.println("Third number is smaller: "+c);
    }
}
