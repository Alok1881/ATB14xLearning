package Java23_October;
import java.util.*;
/*
* Take the below User info and store it into the variables:
              Age (integer)
              Salary (double or float)
              Credit Score (integer)
    Age Validation:
              :- Check if the age is a positive integer.
              :- Ensure the age is at least 18 years old.
              :- Max age can be 80.
    Salary Validation:
             :- Check if the salary is a positive number.
             :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
             :- Check if the credit score is a positive integer.
             :- Define a minimum credit score threshold (e.g., 650).
             :- Max credit score threshold (e.g., 850).
 */
public class LoanEligibilityCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=0;
        double salary=0.00;
        int creditScore=0;
        while(true)
        {
            try
            {
                System.out.println("Enter age,salary and credit score:");
                age=sc.nextInt();
                salary=sc.nextDouble();
                creditScore=sc.nextInt();
                if(age<18 || age>80)
                {
                    System.out.println("Invalid age entered, please enter correct age: ");
                    continue;
                }
                if(salary<0)
                {
                    System.out.println("Invalid Salary entered, please enter correct salary: ");
                    continue;
                }
                if(creditScore<=0)
                {
                    System.out.println("Invalid credit score entered, please enter correct creditScore: ");
                    continue;
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("invalid input, please enter correct input:");
                sc.nextLine();
            }
        }
        if(salary>30000)
        {
            if(creditScore>650 && creditScore<=850)
            {
                System.out.println("Eligible for loan");
            }
            else {
                System.out.println("Not eligible for loan");
            }
        }
        else
        {
            System.out.println("Not eligible for loan");
        }

    }
}
