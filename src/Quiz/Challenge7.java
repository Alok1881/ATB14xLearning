package Quiz;
import java.util.*;
public class Challenge7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        while(true)
        {
            try
            {
                System.out.println("Enter First number: \n");
                a=sc.nextInt();
                System.out.println("Enter Second number: \n");
                b=sc.nextInt();
                System.out.println("Enter Third number: \n");
                c=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input, please enter correct input");
            }
        }
        if(a>b && a>c)
            System.out.println("First number is max of other two number: "+a);
        else if(b>a && b>c)
            System.out.println("Second number is max of other two number: "+b);
        else
            System.out.println("Third number is max of other two number: "+c);
    }
}
