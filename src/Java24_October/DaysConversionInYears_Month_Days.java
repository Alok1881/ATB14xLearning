package Java24_October;
/*:- Take the Days Input from the User
    Define the conversion logic:
        :- Assume 1 year = 365 days.
        :- Assume 1 month = 30 days
        :- Convert the Days into Years, Month and days and Print it.
if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
 */
import java.util.*;
public class DaysConversionInYears_Month_Days {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int days=0;
        int numberOfYears=0;
        int numberOfMonths=0;
        int numberOfDays=0;
        while(true)
        {
            try
            {
                System.out.println("Enter days: ");
                days=sc.nextInt();
                if(days<0)
                {
                    System.out.println("Invalid day, please enter correct day");
                    continue;
                }
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input, please enter correct input: ");
            }
        }
        if(days>=365)
        {
            numberOfYears=days/365;
            days=days-(numberOfYears*365);
            numberOfMonths=days/30;
            days=days-(numberOfMonths*30);
            numberOfDays=days;
        }
        else if(days>30)
        {
            numberOfMonths=days/30;
            numberOfDays=days- (numberOfMonths*30);
        }
        else
            numberOfDays = days;
        System.out.println(numberOfYears+" years, "+numberOfMonths+" months, and "+numberOfDays+" days.");

    }
}
