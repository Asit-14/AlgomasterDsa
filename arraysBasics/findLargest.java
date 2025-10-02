public class findLargest {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 7, 9, 6, 4, 32, 32, 32, 44 };
        int res = findlarg(arr);
        System.out.println(res);
    }

    public static int findlarg(int arr[]) {
        int n = arr.length;
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }

        }
        return larg;
    }
}
