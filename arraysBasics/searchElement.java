public class searchElement {

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 10, 3, 9, 30 };
        int target = 6;
        int res = searchelement(arr, target);
        System.out.println(res);
    }

    public static int searchelement(int arr[] , int tar){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}