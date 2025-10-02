public class findSmallest {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 67, 7, 4};
        int res = findsmallest(arr);
        System.out.println(res);
    }

    public static int findsmallest(int arr[]) {
        int n = arr.length;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
}
