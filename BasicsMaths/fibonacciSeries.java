package BasicsMaths;

import java.util.Arrays;

public class fibonacciSeries {

    public static void main(String[] args) {
        int terms = 10;
        long[] series = generateSeries(terms);
        System.out.println("Fibonacci series (" + terms + " terms): " + Arrays.toString(series));
        int position = 12;
        long nthValue = nthFibonacci(position);
        System.out.println(position + "th Fibonacci number: " + nthValue);
    }

    public static long[] generateSeries(int terms) {
        if (terms <= 0) {
            return new long[0];
        }
        long[] series = new long[terms];
        if (terms >= 1) {
            series[0] = 0;
        }
        if (terms >= 2) {
            series[1] = 1;
        }
        for (int i = 2; i < terms; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }

    public static long nthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Position must be positive");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        long prev = 0;
        long curr = 1;
        for (int i = 3; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
