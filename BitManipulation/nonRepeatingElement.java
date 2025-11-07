package BitManipulation;

public class nonRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {3, 5, 5, 4, 3, 2,2};
        findNonRepeating(arr);
    }

    public static void findNonRepeating(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        System.out.println("Non-repeating element: " + result);
    }
}
