public class Q9_IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean res = triple(arr); // Use boolean, not int
        System.out.println("Increasing triplet exists? " + res);
    }

    public static boolean triple(int nums[]) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true; // Found a number greater than both first and second
            }
        }
        return false;
    }
}
