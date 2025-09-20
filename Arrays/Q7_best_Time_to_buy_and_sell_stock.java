import java.util.*;

public class Q7_best_Time_to_buy_and_sell_stock {

    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bestTimeBuyandSell(nums));  
    }

    public static int bestTimeBuyandSell(int nums[]) {
        int n = nums.length;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                profit += nums[i] - nums[i - 1];
            }
        }
        return profit;
    }
}
