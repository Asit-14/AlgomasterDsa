package Searching;

public class linearSearch {
    public static void main(String[] args) {

        int arr[] = { 1, 32, 43, 2, 43, 1, 43, 322, 5, 7, 98, 0 };
        int tar = 322;
        SearchingELement(arr, tar);
    }

    public static int SearchingELement(int arr[],  int  tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                System.out.println(i);
            }
        }
        return -1;
    }
}
