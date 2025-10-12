package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Table of "+i+ ":");
            for(int j=1;j<=10;j++)
            {
                System.out.println(i+"*"+j+" = "+i*j);
            }
        }
    }
}
