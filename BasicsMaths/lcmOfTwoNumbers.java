package BasicsMaths;

public class lcmOfTwoNumbers {

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        long lcm = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }

    public static long lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        long gcdValue = gcdEuclid.gcd(a, b);
        return (Math.abs((long) a * b)) / gcdValue;
    }
}
