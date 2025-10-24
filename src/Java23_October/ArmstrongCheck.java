package Java23_October;
import java.util.*;
public class ArmstrongCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        int n=0;
        int arms=0;

    while(true)
    {
        try
        {
            System.out.println("Enter number for armstrong check: ");
            num=sc.nextInt();
            break;
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter valid input for Armstrong check");
            sc.nextLine();
        }
    }
    n=String.valueOf(Math.abs(num)).length();
    int original=num;
    for(int i=1;i<=n;i++) {
        int  temp=num%10;

        arms=arms+(int)Math.pow(temp,n);
        num=num/10;
    }
    if(original==arms)
    {
        System.out.println("Armstrong number");
    }
    else
    {
        System.out.println("Not an Armstrong number");
    }
    }
    }

