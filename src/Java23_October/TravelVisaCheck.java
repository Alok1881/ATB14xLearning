package Java23_October;
/*
    take the input from the user for
            Age (integer).
            Visa Status (String or boolean).
     Check Eligibility:
             :- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
        Validation Criteria
                Age: - Must be a non-negative integer.
                         :- Should be greater than or equal to 18 to be eligible to travel.
        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
                               :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
 */
import java.util.*;
public class TravelVisaCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Age=0;
        boolean visa=false;
        while(true)
        {
            try
            {
                System.out.println("Enter age:");
                Age=sc.nextInt();
                if(Age<0)
                {
                    System.out.println("Invalid age, please enter correct age:");
                    continue;
                }
                System.out.println("Enter Visa status:");
                visa=sc.nextBoolean();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input,please enter correct input: ");
                sc.nextLine();
            }
        }
        if(Age>=18)
        {
            if(visa)
            {
                System.out.println("Eligible for Travel");
            }
            else
                System.out.println("Not eligible for Travel, as Visa Status is invalid or False");
        }
        else
        {
            System.out.println("Person below 18 years of age are not eligible to Travel");
        }
    }
}
