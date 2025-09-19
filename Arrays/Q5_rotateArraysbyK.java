import java.util.Arrays;

public class Q5_rotateArraysbyK {

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7 };
        int k = 3;

        rotate(arr, k);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;  
        rotateArray(arr, 0, n - 1);
        rotateArray(arr, 0, k - 1);
        rotateArray(arr, k, n - 1);
    }

    private static void rotateArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
