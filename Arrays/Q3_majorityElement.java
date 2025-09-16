public class Q3_majorityElement {

    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
          //  count += (num == candidate) ? 1 : -1;

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        Q3_majorityElement obj = new Q3_majorityElement();

        int majority = obj.majorityElement(nums);  
        System.out.println("Majority Element: " + majority);
    }
}
