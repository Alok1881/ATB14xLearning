package Java04_October;
import java.util.*;
public class Vowel_Consonant_Count {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        int vowelCount=0;
        int ConsonantCount=0;
        String st=sc.nextLine().trim();
        char[] ch=st.toCharArray();
        for(int i=0;i<st.length();i++)
        {
            if("aeiou".indexOf(ch[i])!=-1)
                vowelCount++;
            else
                ConsonantCount++;

        }
        System.out.println("total no. of vowels: "+vowelCount);
        System.out.println("Total no. of consonant: "+ConsonantCount);
    }
}
