package Java23_October;
/*:- take the salary and Year info from the User.
Implement Bonus Calculation Logic:
     Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
 */
import java.util.*;
public class BonusCalculation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double salary=0.00;
        double bonus=0.00;
        float yearOfExperience=0;
        while(true)
        {
            try
            {
                System.out.println("Enter Salary: ");
                salary=sc.nextDouble();
                if(salary<0) {
                    System.out.println("invalid salary, please enter correct salary: ");
                    continue;
                }
                System.out.println("Enter year of experience");
                yearOfExperience=sc.nextFloat();
                if(yearOfExperience<0)
                {
                    System.out.println("Invalid year of experience,please pass correct experience: ");
                    continue;
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input,please enter correct input: ");
                sc.nextLine();
            }
        }
        if(yearOfExperience>6)
        {
            bonus=salary*0.15;
        }
        else if(yearOfExperience>=4)
                    {
                        bonus=salary*0.10;
                    }
        else if(yearOfExperience>=1)
        {
            bonus=salary*0.05;

        }
        else
        {
           bonus=0;
        }
        System.out.println("Your Bonus is: "+bonus+" .Keep up the good work");
    }

}
