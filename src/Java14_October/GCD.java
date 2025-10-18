package Java14_October;
import java.util.*;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a & b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=1;
        int condi=a>b?a:b;
        for(int i=1;i<=condi;i++)
        {
            if(a%i==0 && b%i==0)
                temp=i;
        }
        System.out.println("GCD is: "+temp);
    }
}
