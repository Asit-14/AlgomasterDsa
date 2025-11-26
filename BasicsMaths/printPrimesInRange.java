package BasicsMaths;

import java.util.ArrayList;
import java.util.List;

public class printPrimesInRange {

    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        List<Integer> primes = primesInRange(start, end);
        System.out.println("Primes between " + start + " and " + end + ": " + primes);
    }

    public static List<Integer> primesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        if (start > end) {
            return primes;
        }
        for (int number = Math.max(2, start); number <= end; number++) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
