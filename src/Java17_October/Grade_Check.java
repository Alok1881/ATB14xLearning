package Java17_October;
import java.util.*;
public class Grade_Check {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int score=0;
    while(true)
    {
        try
        {
            System.out.println("Enter score: ");
            score=sc.nextInt();
            if(score>100 || score<0)
            {
                System.out.println("invalid score");
                continue;
            }
            break;
        }
        catch (InputMismatchException e)
        {
            System.out.println("invalid input, please enter valid score: ");
            sc.nextLine();
        }
    }
    if(score>=90)
    {
        System.out.println("Grade is "+" A++");
    }
    else if(score>=80 && score<90)
    {
        System.out.println("Grade is "+ " A");
    }
    else if(score>=70 && score<80)
    {
        System.out.println("Grade is "+" B");
    }
    else if(score>=60 && score<70)
    {
        System.out.println("Grade is "+" C");
    }
    else if(score>=50 && score<60)
    {
        System.out.println("Grade is "+" D");
    }
    else if(score>=40 && score<50)
    {
        System.out.println("Grade is "+" E");
    }
    else
        System.out.println("Fail");
}
}
