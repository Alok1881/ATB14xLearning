package Java23_October;
import java.util.*;
public class EmployeeNetSalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary components
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA (percentage of basic, e.g., enter 30 for 30%): ");
        double hraPercent = sc.nextDouble();

        System.out.print("Enter DA (percentage of basic, e.g., enter 20 for 20%): ");
        double daPercent = sc.nextDouble();

        System.out.print("Enter Tax Deduction (percentage of gross salary, e.g., 10 for 10%): ");
        double taxPercent = sc.nextDouble();

        // Calculations
        double hra = basic * hraPercent / 100.0;
        double da  = basic * daPercent  / 100.0;

        double grossSalary = basic + hra + da;
        double taxDeduction = grossSalary * taxPercent / 100.0;

        double netSalary = grossSalary - taxDeduction;

        // Output results with explanations
        System.out.println("\n--- Salary Break-up ---");
        System.out.printf("Basic Pay         : %.2f%n", basic);
        System.out.printf("HRA (%.2f%%)       : %.2f%n", hraPercent, hra);
        System.out.printf("DA (%.2f%%)        : %.2f%n", daPercent, da);
        System.out.printf("Gross Salary      : %.2f%n", grossSalary);
        System.out.printf("Tax Deduction (%.2f%% of gross): %.2f%n", taxPercent, taxDeduction);
        System.out.printf("Net Salary        : %.2f%n", netSalary);

        sc.close();
    }
}
