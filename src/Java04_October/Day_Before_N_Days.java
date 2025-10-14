package Java04_October;
/*Given two integers d and n. Where d is the day, out of 7 days of the week,
 d varies from 0 to 6 as shown below.
0 - Sunday
1 - Monday
2 - Tuesday
3 - Wednesday
4 - Thursday
5 - Friday
6 - Saturday

You have to return the index for the day which is n days before the given day d.*/
import java.util.*;
public class Day_Before_N_Days {
    public static void main(String [] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter no. of days of the week and n days before given day");
    int d=scn.nextInt();
    int n=scn.nextInt();
    int result=(d-n)%7;
    if (result<0)
    {
        result+=7;
    }
    System.out.println("Days of the week: "+result);
    }
}
