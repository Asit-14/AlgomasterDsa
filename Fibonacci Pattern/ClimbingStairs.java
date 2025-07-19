import java.util.*;

public class ClimbingStairs {

     // 1. Simple recursion
     public static int simpleWays(int n) {
          if (n == 0)
               return 1;
          if (n < 0)
               return 0;
          return simpleWays(n - 1) + simpleWays(n - 2);
     }

     // 2. Memoization
     public static int memoizationWays(int n, int[] dp) {
          if (n == 0)
               return 1;
          if (n < 0)
               return 0;
          if (dp[n] != -1)
               return dp[n];
          dp[n] = memoizationWays(n - 1, dp) + memoizationWays(n - 2, dp);
          return dp[n];
     }

     // 3. Tabulation
     public static int tabulationWays(int n) {
          int[] dp = new int[n + 1];
          dp[0] = 1;
          for (int i = 1; i <= n; i++) {
               if (i == 1) {
                    dp[i] = dp[i - 1];
               } else {
                    dp[i] = dp[i - 1] + dp[i - 2];
               }
          }
          return dp[n];
     }

     public static void main(String[] args) {
          int n = 5;

          // 1. Simple recursion
          int ans1 = simpleWays(n);
          System.out.println("Recursion solution is: " + ans1);

          // 2. Memoization
          int[] dp = new int[n + 1];
          Arrays.fill(dp, -1);
          int ans2 = memoizationWays(n, dp);
          System.out.println("Memoization solution is: " + ans2);

          // 3. Tabulation
          int ans3 = tabulationWays(n);
          System.out.println("Tabulation solution is: " + ans3);
     }
}
