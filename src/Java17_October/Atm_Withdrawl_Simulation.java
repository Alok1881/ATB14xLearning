package Java17_October;
import java.util.*;
public class Atm_Withdrawl_Simulation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int account_balance=10000;
        int withdraw_amount=0;
        while(true)
        {
            try {
                System.out.println("Enter amount to be withdrawn");
                withdraw_amount = sc.nextInt();
                if (withdraw_amount == 0) {
                    System.out.println("Enter correct amount to be withdrawn");
                    continue;
                }
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input, please pass correct value: ");
                sc.nextLine();
            }
        }
        if(withdraw_amount%100==0)
        {
            if(withdraw_amount<=account_balance)
            {
                account_balance=account_balance - withdraw_amount;
                System.out.println("Balance after deduction is: "+account_balance);
            }
            else
                System.out.println("withdrawal amount should not exceed the account balance");
        }
        else
            System.out.println("invalid withdrawal amount should be multiple of 100");
    }
}
