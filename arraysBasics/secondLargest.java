public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 6, 4, 46, 64, 4, 3 };
        int res = seclargest(arr);
        System.out.println(res);
    }

    public static int seclargest(int arr[]) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int n = arr.length;
        if (n < 2) {
            System.out.println("Array  Should  Have atleast 2  element");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest || arr[i] > firstLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}


// corner case
//  array  is  empty
//  array  has  negative  number 
//  array  has  duplicate 
