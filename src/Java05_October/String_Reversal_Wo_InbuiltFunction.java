package Java05_October;
//Write a program to reverse a string without using inbuilt functions.
import java.util.*;

public class String_Reversal_Wo_InbuiltFunction {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter String for reversal");
        String st=scn.nextLine();
        String rev="";
        for(int i=st.length()-1;i>=0;i--)
        {
            rev= rev + st.charAt(i);
        }
        System.out.println("Reverse:"+ rev);

    }
}
