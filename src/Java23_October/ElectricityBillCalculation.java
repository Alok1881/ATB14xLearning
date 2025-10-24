package Java23_October;
/*
           :- take the input from the user of Units.

    Implement Rate Structure:
    Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit
 */
import java.util.*;
public class ElectricityBillCalculation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int unit=0;
        double bill=0.00;
        while(true)
        {
            try
            {
                System.out.println("Enter no. of unit consumed:");
                unit=sc.nextInt();
                if(unit<0) {
                    System.out.println("invalid input, please enter correct no. of unit consumed: ");
                    continue;
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("invalid input, please input correct unit: ");
            }
        }
        if(unit>300)
        {
            int newUnit=unit-300;
            bill+=(newUnit*1.50)+245;
        }
        else if(unit>200)
        {
            int newUnits=unit-200;
            bill+=(newUnits*1.20)+125;
        }
        else if(unit>100)
        {
            int newUnitss=unit-100;
            bill+=(newUnitss*0.75)+50;
        }
        else if(unit>0)
        {
            bill+=unit*0.50;
        }
        System.out.println("Your bill is: "+bill);
    }
}
