package Java23_October;
import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="";
        String rev="";
        while(true)
        {
            try
            {
                System.out.println("Enter string for palindrome check");
                s=sc.nextLine();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input,please enter string");
                sc.nextLine();
            }

        }
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
}
