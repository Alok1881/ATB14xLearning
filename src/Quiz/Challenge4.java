package Quiz;

public class Challenge4 {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Initial value of i: " + i);

        System.out.println("\n=== Pre-Increment (++i) ===");
        System.out.println("Value before operation: " + i);
        System.out.println("Value returned by ++i: " + (++i)); // Increment first, then use
        System.out.println("Value after operation: " + i);

        System.out.println("\n=== Post-Increment (i++) ===");
        System.out.println("Value before operation: " + i);
        System.out.println("Value returned by i++: " + (i++)); // Use first, then increment
        System.out.println("Value after operation: " + i);

        System.out.println("\n=== Pre-Decrement (--i) ===");
        System.out.println("Value before operation: " + i);
        System.out.println("Value returned by --i: " + (--i)); // Decrement first, then use
        System.out.println("Value after operation: " + i);

        System.out.println("\n=== Post-Decrement (i--) ===");
        System.out.println("Value before operation: " + i);
        System.out.println("Value returned by i--: " + (i--)); // Use first, then decrement
        System.out.println("Value after operation: " + i);
    }
}
