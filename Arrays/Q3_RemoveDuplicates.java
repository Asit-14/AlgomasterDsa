public class Q3_RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 5, 5, 6, 6 }; 
        int res = removeDuplicates(arr);
        System.out.println(res);

        
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        
        int l = 1; 
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) { 
                arr[l] = arr[i];
                l++;
            }
        }
        return l;
    }
}
