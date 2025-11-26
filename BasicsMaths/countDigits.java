package BasicsMaths;

public class countDigits {

    public static void main(String[] args) {
        int number = 543443;
        int digits = digitsCount(number);
        System.out.println("Number of digits in " + number + ": " + digits);
    }

    public static int digitsCount(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
