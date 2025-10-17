public class Q12_missingNumber {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 0, 4};
        int res = CountMissing(arr);
        System.out.println(res);
    }

    public static int CountMissing(int arr[]) {
        int n = arr.length;
        int totalSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return totalSum - sum;
    }
}
