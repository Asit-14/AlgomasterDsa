class Q8_NumberOfZeroFilledSubarrays {
    public static void main(String[] args) {
        Q8_NumberOfZeroFilledSubarrays obj = new Q8_NumberOfZeroFilledSubarrays();
        
        int[] nums = {0, 0, 0, 2, 0, 0}; 
        long result = obj.zeroFilledSubarray(nums);
        
        System.out.println("Number of zero-filled subarrays: " + result);
    }

    public long zeroFilledSubarray(int[] nums) {
        int zeroCount = 0;   
        long totalSubarrays = 0; 

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalSubarrays += (long) zeroCount * (zeroCount + 1) / 2;
                zeroCount = 0;
            }
        }

        // Handle remaining zeros at the end
        totalSubarrays += (long) zeroCount * (zeroCount + 1) / 2;

        return totalSubarrays;
    }
}
