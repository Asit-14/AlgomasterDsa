public class Q11_max_consicutiveOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0 };
        int res = countOnes(arr);
        System.out.println(res);

    }

    public static int countOnes(int[] nums) {
        int n = nums.length;
        int currcount = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                currcount++;

            } else {
                maxCount = Math.max(currcount, maxCount);
                currcount = 0;
            }
        }
        return Math.max(maxCount, maxCount);
     }
}
