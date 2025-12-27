public class Q2_MoveZeroesStart {
    public static void main(String[] args) {
        int num1[] = {1, 0, 2, 0, 3};
        moveZeroesToStartapp(num1);
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        
        int num2[] = {5, 0, 1, 0, 2};
        moveZeroesToStart(num2);
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();
    }

    public static void moveZeroesToStartapp(int[] num) {
        int n = num.length;
        int idx = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (num[i] != 0) {
                num[idx] = num[i];
                idx--;
            }
        }
        while (idx >= 0) {
            num[idx] = 0;
            idx--;
        }
    }
    
    public static void moveZeroesToStart(int[] num) {
        int n = num.length;
        int writePos = n - 1;
        
        for (int i = n - 1; i >= 0; i--) {
            if (num[i] != 0) {
                num[writePos] = num[i];
                writePos--;
            }
        }
        
        while (writePos >= 0) {
            num[writePos] = 0;
            writePos--;
        }
    }
}
