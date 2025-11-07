package BitManipulation;

public class powerOfTwo {
    public static void main(String[] args) {
        int n = 55;
        poweroftwo(n);
    }

    public static void poweroftwo(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Number  is power of  two");
        } else {
            System.out.println("Number is not power of two");
        }
    }
}
