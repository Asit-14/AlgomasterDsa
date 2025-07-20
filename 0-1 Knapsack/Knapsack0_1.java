public class Knapsack0_1 {
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        int dp[][] = new int[val.length + 1][W + 1];
        // Fill dp with -1
        for (int i = 0; i <= val.length; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Without memoization (Recursion): " + knapsackRecursive(val, wt, W, val.length));
        System.out.println("With memoization (Top-Down DP): " + knapsackMemoization(val, wt, W, val.length, dp));
        System.out.println("Tabulation (Bottom-Up DP): " + knapsackTabulation(val, wt, W));
    }

    // 1️⃣ Pure Recursive Approach
    // Time Complexity: O(2^n)
    // Space Complexity: O(n) (due to recursion stack)
    public static int knapsackRecursive(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapsackRecursive(val, wt, W - wt[n - 1], n - 1);
            int exclude = knapsackRecursive(val, wt, W, n - 1);
            return Math.max(include, exclude);
        } else {
            return knapsackRecursive(val, wt, W, n - 1);
        }
    }

    // 2️⃣ Memoization Approach (Top-Down DP)
    // Time Complexity: O(n * W)
    // Space Complexity: O(n * W) + O(n) for recursion stack
    public static int knapsackMemoization(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapsackMemoization(val, wt, W - wt[n - 1], n - 1, dp);
            int exclude = knapsackMemoization(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(include, exclude);
        } else {
            dp[n][W] = knapsackMemoization(val, wt, W, n - 1, dp);
        }

        return dp[n][W];
    }

    // 3️⃣ Tabulation Approach (Bottom-Up DP)
    // Time Complexity: O(n * W)
    // Space Complexity: O(n * W)
    public static int knapsackTabulation(int val[], int wt[], int W) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    int include = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    int exclude = dp[i - 1][j];
                    dp[i][j] = Math.max(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }
}
