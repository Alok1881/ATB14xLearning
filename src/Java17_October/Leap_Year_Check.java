package Java17_October;
import java.util.*;
public class Leap_Year_Check {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int year=0;

    while(true)
    {
        try
        {
            System.out.println("Enter valid year: ");
            year=sc.nextInt();
            if(year<0)
            {
                System.out.println("invalid input, enter valid year:");
                continue;
            }
            break;
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input,please enter correct year value: ");
            sc.nextLine();
        }
    }
    if(year%400==0)
    {
        System.out.println("Leap year");
    }
    else if(year%4==0 && year%100!=0)
    {
        System.out.println("Leap year");
    }
    else {
        System.out.println("Not a Leap year");
    }
}
}