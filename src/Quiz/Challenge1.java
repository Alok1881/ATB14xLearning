package Quiz;

public class Challenge1 {
    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 20000;
        int intVar = 100000;
        long longVar = 10000000000L;

        float floatVar = 12.34f;
        double doubleVar = 1234.5678;

        char charVar = 'A';
        boolean boolVar = true;

        // 🔹 Non-Primitive Data Types (Reference Types)
        String stringVar = "Hello, Java!";

        // 🔹 Display all variables
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("char value: " + charVar);
        System.out.println("boolean value: " + boolVar);

        System.out.println("\n=== Non-Primitive Data Type ===");
        System.out.println("String value: " + stringVar);
    }
}
