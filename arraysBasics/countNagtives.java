public class countNagtives {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, -4, 3, -5, -3, -9, 4 };
        int res = countneg(arr);
        System.out.println(res);
    }

    public static int countneg(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                count = count + 1;
            }

        }
        return count;
    }
}
