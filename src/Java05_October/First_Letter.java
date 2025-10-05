package Java05_October;

import java.util.*;

//First Letter of Each Word in a String.
public class First_Letter {
    public static void main(String[] args)
    {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter string");
    String sent=scn.nextLine();
    String[] word= sent.split(" ");
    for(int i=0;i<word.length;i++)
        {
            System.out.print(word[i].charAt(0)+" ");
        }
    }
}
