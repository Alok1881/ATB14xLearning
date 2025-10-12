package Quiz;

public class Challenge2 {
    public static void main(String[] args) {

                // Declare and initialize variables
                int a = 20;
                int b = 6;
                int result;

                System.out.println("=== Arithmetic Operators ===");

                // Addition
                result = a + b;
                System.out.println("a + b = " + result);

                // Subtraction
                result = a - b;
                System.out.println("a - b = " + result);

                // Multiplication
                result = a * b;
                System.out.println("a * b = " + result);

                //Division
                result = a / b; // integer division
                System.out.println("a / b = " + result);

                //With floating division
                double divResult = (double) a / b;
                System.out.println("a / b (as double) = " + divResult);

                //Modulus (Remainder)
                result = a % b;
                System.out.println("a % b = " + result);

                //Demonstrate Assignment Operators
                System.out.println("\n=== Assignment Operators ===");

                int x = 10;
                System.out.println("Initial x = " + x);

                x += 5;  // same as x = x + 5
                System.out.println("After x += 5 → x = " + x);

                x -= 3;  // same as x = x - 3
                System.out.println("After x -= 3 → x = " + x);

                x *= 2;  // same as x = x * 2
                System.out.println("After x *= 2 → x = " + x);

                x /= 4;  // same as x = x / 4
                System.out.println("After x /= 4 → x = " + x);

                x %= 3;  // same as x = x % 3
                System.out.println("After x %= 3 → x = " + x);
    }
}
