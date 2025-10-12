package Quiz;

public class Challenge3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("=== Comparison Operators ===");

        // Equal to
        System.out.println("a == b : " + (a == b));

        // Not equal to
        System.out.println("a != b : " + (a != b));

        // Greater than
        System.out.println("a > b  : " + (a > b));

        // Less than
        System.out.println("a < b  : " + (a < b));

        // Greater than or equal to
        System.out.println("a >= b : " + (a >= b));

        // Less than or equal to
        System.out.println("a <= b : " + (a <= b));

        System.out.println("\n=== Logical Operators ===");

        boolean x = true;
        boolean y = false;

        // Logical AND (&&)
        System.out.println("x && y : " + (x && y)); // true only if both are true

        // Logical OR (||)
        System.out.println("x || y : " + (x || y)); // true if any one is true

        // Logical NOT (!)
        System.out.println("!x     : " + (!x)); // reverses boolean value of x
        System.out.println("!y     : " + (!y));

        System.out.println("\n=== Combining Comparison and Logical Operators ===");

        int age = 25;
        int salary = 40000;

        // Check multiple conditions using logical operators
        boolean isEligible = (age > 18 && salary > 30000);
        boolean isSenior = (age >= 60 || salary > 50000);

        System.out.println("Is person eligible (age > 18 && salary > 30000)? " + isEligible);
        System.out.println("Is person senior (age >= 60 || salary > 50000)? " + isSenior);

    }
}
