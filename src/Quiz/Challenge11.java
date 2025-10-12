package Quiz;
import java.util.*;
public class Challenge11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(true)
        {
            try
            {
                System.out.println("Enter value of n: \n");
                n=sc.nextInt();
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("invalid input, Enter integer value for n: ");
            }
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}
