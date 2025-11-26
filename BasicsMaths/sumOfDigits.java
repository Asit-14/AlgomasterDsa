package BasicsMaths;

public class sumOfDigits {

    public static void main(String[] args) {
        int number = 98765;
        int sum = sumDigits(number);
        System.out.println("Sum of digits of " + number + " is " + sum);
    }

    public static int sumDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
