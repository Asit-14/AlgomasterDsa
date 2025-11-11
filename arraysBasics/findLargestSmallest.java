public class findLargestSmallest {
    public static void main(String[] args) {
        int arr[] = { 43, 33, 34, 2, 231, 4, 23, 23, 32 };
        findlargandsmall(arr);
    }

    public static void  findlargandsmall(int []nums){
        int min = nums[0];
        int max = nums[0];
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }

        }
        System.out.println("Largesst elemnt : " + max);
            System.out.println("Smllest Element: " + min);
    }
}
