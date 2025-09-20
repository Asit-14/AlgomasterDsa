import java.util.Arrays;

public class Q6_product_of_array_except_self {
    
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(selfproduct(nums)));
        System.out.println(Arrays.toString(selfproductoptimized(nums)));
    }

    // Prefix and Suffix Products
    public static int[] selfproduct(int num[]) {

        int n = num.length;
        int Suffix[] = new int[n];
        int Prefix[] = new int[n];
        int output[] = new int[n];

        // Prefix product
        Prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            Prefix[i] = Prefix[i - 1] * num[i - 1];
        }

        // Suffix product
        Suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            Suffix[i] = Suffix[i + 1] * num[i + 1];
        }

        // Final output
        for (int i = 0; i < n; i++) {
            output[i] = Suffix[i] * Prefix[i];
        }

        return output;
    }


    public static int[] selfproductoptimized(int[] nums) {
        int n = nums.length;
        int op[] = new int[n];

        op[0] =  1 ; 
        for (int i = 1; i < n; i++) {
            op[i] = op[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            op[i] *= right;
            right *= nums[i];
        }
        return op;
    }
}
