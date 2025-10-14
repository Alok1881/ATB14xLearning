package Java04_October;
import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char[] ch=st.toCharArray();
        boolean result=true;
        for(int i=0;i<st.length();i++)
        {
            if(ch[i]!=ch[st.length()-i-1])
                result=false;
        }
        if(result==true)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
