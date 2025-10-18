package Java17_October;
import java.util.*;
public class CharacterAlphabet_Check {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=' ';
        while(true)
        {
            try
            {
                System.out.println("Enter character:");
                ch=sc.next().charAt(0);
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input,please enter valid character");
                sc.nextLine();
            }
        }
        if(Character.isLetter(ch))
        {
            System.out.println(ch+ " is Alphabet");
        }
        else
            System.out.println(ch+ " is not an Alphabet");
    }
}
