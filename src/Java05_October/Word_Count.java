package Java05_October;

import java.util.*;
//Count the Number of Words in a String.
public class Word_Count {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter String for Word count");
        String st=scn.nextLine();
        String[] count=st.split(" ");
        int wordCount=count.length;
        System.out.println("No. of words in a string is: "+wordCount);

    }
}
