import java.util.Arrays;

public class Fibonacci {

    // 1. Simple Recursion (Brute Force)
    public static int simpleFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return simpleFibonacci(n - 1) + simpleFibonacci(n - 2);
    }

    // 2. Memoization (Top-Down DP)
    // Known as the “top-down” dynamic programming, usually the problem is solved in
    // the direction of the main problem to the base cases.
    public static int memoizationFib(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = memoizationFib(n - 1, dp) + memoizationFib(n - 2, dp);
        return dp[n];
    }

    // 3. Tabulation (Bottom-Up DP)
      //Tabulation is a ‘bottom-up’ approach where we start from the base case and reach the final answer that we want
    public static int tabulationFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Main method to call
    public static void main(String[] args) {
        int n = 5;

        // 1. Simple Recursion
        int res1 = simpleFibonacci(n);
        System.out.println("Simple Recursion: Fibonacci of " + n + " is " + res1);

        // 2. Memoization
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int res2 = memoizationFib(n, dp);
        System.out.println("Memoization: Fibonacci of " + n + " is " + res2);

        // 3. Tabulation
        int res3 = tabulationFib(n);
        System.out.println("Tabulation: Fibonacci of " + n + " is " + res3);
    }
}
