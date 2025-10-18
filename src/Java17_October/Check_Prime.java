package Java17_October;
import java.util.*;
public class Check_Prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=0;
        while(true)
        {
            try
            {
                System.out.println("Enter a number: ");
                num=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input,please enter valid number: ");
                sc.nextLine();
            }
        }
        boolean isPrime=true;
//        if(num==1||num==2) {
//            System.out.println("Prime");
//        }
        for(int i=3;i*i<=num;i++)
        {
            if(num%i==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime==false)
        {
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime number");
        }
    }
}
