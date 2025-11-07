package BitManipulation;

public class coutnSetBits {
    public static void main(String[] args) {
        int n = 13;
        countSetBits(n);
    }

    public static void countSetBits(int nums) {
        int count = 0;
        while (nums > 0) {
            nums = nums & (nums - 1);
            count++;
        }
        System.out.println("Total Bits in the Program: "+ count);
    }
}
