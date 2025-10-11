public class Q10_remove_element {
    public static void main(String[] args) {

        int arr[] = { 2, 32, 54, 45, 2, 34, 2, 54, 2, 34, 34 };
        int val = 34;
        int[] res = removeElement(arr, val);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] removeElement(int[] arr, int val) {
        int n = arr.length;
        int x = 0; 

        // First, move all non-val elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[x] = arr[i];  // corrected line
                x++;
            }
        }

        // Now create a new array of size x (without the removed elements)
        int[] result = new int[x];
        for (int i = 0; i < x; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
