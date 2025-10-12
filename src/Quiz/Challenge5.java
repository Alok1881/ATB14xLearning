package Quiz;

public class Challenge5 {
    public static void main(String[] args) {
        System.out.println("=== Operator Precedence Demo ===");

        int a = 10, b = 5, c = 2;

        // Expression 1: Multiplication (*) has higher precedence than addition (+)
        int result1 = a + b * c; // Evaluates as: a + (b * c)
        System.out.println("a + b * c = " + result1 + "   --> Because '*' is evaluated before '+'");

        //Expression 2: Parentheses override precedence
        int result2 = (a + b) * c; // Evaluates as: (10 + 5) * 2 = 30
        System.out.println("(a + b) * c = " + result2 + "   --> Parentheses evaluated first");

        //Expression 3: Division and multiplication have same precedence, evaluated left-to-right
        int result3 = a / b * c; // (10 / 5) * 2 = 4
        System.out.println("a / b * c = " + result3 + "   --> Left to right for same precedence");

        //Expression 4: Complex expression with multiple operators
        int result4 = a + b * c - a / c;
        // Step: (b * c) = 10, (a / c) = 5 → 10 + 10 - 5 = 15
        System.out.println("a + b * c - a / c = " + result4 + "   --> Evaluated using operator precedence rules");

        //Expression 5: Using modulus (%) in precedence
        int result5 = a + b % c; // % has higher precedence than +
        System.out.println("a + b % c = " + result5 + "   --> '%' evaluated before '+'");

        // -----------------------------------------------------------------------------------
        System.out.println("\n=== Type Casting Demo ===");

        //Implicit (Widening) Casting: smaller → larger type
        int numInt = 100;
        double numDouble = numInt; // int automatically converted to double
        System.out.println("Implicit casting (int → double): " + numDouble);

        //Explicit (Narrowing) Casting: larger → smaller type (requires cast)
        double price = 99.99;
        int intPrice = (int) price; // Fractional part lost
        System.out.println("Explicit casting (double → int): " + intPrice + "   --> Fractional part truncated");

        //Example: Mixing types in expression (int + double)
        double mixedResult = numInt + price; // int is automatically promoted to double
        System.out.println("Mixed type operation (int + double): " + mixedResult + "   --> int auto-promoted to double");

        //Example: Casting result of arithmetic operation
        double div = 10 / 3; // Integer division because both operands are int
        System.out.println("10 / 3 (without casting): " + div);

        double divCorrect = (double) 10 / 3; // One operand cast to double → real division
        System.out.println("(double)10 / 3 (with casting): " + divCorrect);
    }
}
