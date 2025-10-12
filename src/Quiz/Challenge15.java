package Quiz;

public class Challenge15 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int num = 2; num <= 100; num++) {   // start from 2, since 1 is not prime
            boolean isPrime = true;

            // check divisibility up to √num for optimization
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;  // found a divisor, not prime
                    break;
                }
            }

            if (isPrime)
                System.out.print(num + " ");
        }
    }
}
