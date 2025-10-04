package Java04_October;
/*Write a program that calculates and displays the letter grade
for a given numerical score (e.g., A, B, C, D, or F) based on the
following grading scale:

A: 90-100

B: 80-89

C: 70-79

D: 60-69

F: 0-59
 */
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Score");
        int score=scn.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("A");
        }
        else if(score>=80 && score<90)
        {
            System.out.println("B");
        }
        else if(score>=70 && score<80)
        {
            System.out.println("C");
        }
        else if(score>=60 && score<70)
        {
            System.out.println("D");
        }
        else if(score>0 && score<60)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("invalid score");
        }
    }
}
