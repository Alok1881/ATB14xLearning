package Java10_October;
import java.util.*;
public class VowelConsonantCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=' ';

    while(true)
    {
        System.out.println("Enter Character: ");
        String input = sc.next();

        // Validate: check if input is a single alphabetic character
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            ch = input.charAt(0);
            break;
        } else {
            System.out.println("Invalid input, please input a single alphabetic character.\n");
        }
    }
    if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' )
    {
        System.out.println("Entered character is Vowel: "+ch);
    }
    else
        System.out.println("Entered character is Consonant: "+ch);
    }
}
