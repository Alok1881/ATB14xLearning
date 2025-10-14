package Java04_October;
import java.util.*;
public class Check_Prime {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int num=0;
    boolean result=true;
    while(true)
    {
        try
        {
            System.out.println("Enter number:\n");
            num=sc.nextInt();
            break;
        }
        catch(InputMismatchException e)
        {
            System.out.println("invalid input, please enter integer value: ");
        }
    }
    for(int i=2;i<=num/2;i++)

    {
        if (num % i == 0)
        {
            result = false;
            break;
        }
    }
    if(result==true)
    {
        System.out.println("Given number is a prime number");
    }
    else
        System.out.println("Given number is not a prime number");
}
}