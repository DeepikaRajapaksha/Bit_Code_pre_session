import java.util.Scanner;

public class SimpleCommonFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        long gcd = gcd(a, b);
        int count = 0;
        long sum = 0;
        long smallestPrime = -1;

        for (long i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
                sum += i;
                if (smallestPrime == -1 && isPrime(i)) {
                    smallestPrime = i;
                }
            }
        }

        System.out.println(count); // Number of common factors
        System.out.println(sum);   // Sum of common factors
        System.out.println(isPrime(count) ? "YES" : "NO"); // Is count of factors prime?
        System.out.println(gcd);   // Largest common factor (GCD)
        System.out.println(smallestPrime); // Smallest prime factor
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    private static boolean isPrime(long number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (long i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}
