package BasicsMaths;

public class isPalindrome {

    public static void main(String[] args) {
        int n = 2412;
        boolean res = palindrom(n);
        System.out.println(res);

    }

    public static boolean palindrom(int n) {
        if (n < 0) {
            return false;
        }
        int org = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return org == rev;
    }
}