package Java10_October;
import java.util.*;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=0;
        while(true)
        {
            System.out.println("Enter age: \n");
            try {
                age=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("invalid input, please enter correct age: ");
            }

        }
        if(age>=18)
        {
            System.out.println("Eligible for vote: "+age);
        }
        else if(age>0)
            System.out.println("not eligible for vote: "+age);
        else
            System.out.println("invalid age: "+age);
    }
}
