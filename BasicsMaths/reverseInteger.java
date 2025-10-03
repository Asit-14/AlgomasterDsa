package BasicsMaths;

public class reverseInteger {
    public static void main(String[] args) {
        int n = -12345;
        int reversed = reverse(n);
        System.out.println(reversed); // Output: -54321
    }

    public static int reverse(int x) {
        long rev = 0;
        int n = Math.abs(x);
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        if (rev > Integer.MAX_VALUE)
            return 0;
        return x < 0 ? (int) -rev : (int) rev;
    }
}
