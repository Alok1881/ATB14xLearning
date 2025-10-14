package Java04_October;
import java.util.*;
public class Fibonacci_Series {
    public static int fibonacci(int n)
    {
        if(n<=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonacci series number of terms:");
        int num = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        if(num==1) {
//            System.out.println(a + " " + b);
//            break;
//        }
        for(int i=0;i<=num;i++)
        {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
