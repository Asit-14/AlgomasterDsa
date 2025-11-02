public class Q13_SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3, 2, 1 };
        int res = SingleNumber(nums);
        System.out.println(res);
    }

    public static int SingleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
