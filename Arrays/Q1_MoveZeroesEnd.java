public class Q1_MoveZeroesEnd {
    public static void main(String[] args) {
        Q1_MoveZeroesEnd obj = new Q1_MoveZeroesEnd();
        int nums[] = { 0, 2, 0, 0, 0, 3, 0, 0, 3, };
        obj.moveends(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        obj.moveendbyswap(nums);
           for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void moveends(int nums[]) {

        int n = nums.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        while (idx < n) {
            nums[idx] = 0;
            idx++;
        }
    }
        
    public static  void moveendbyswap(int  nums[]){
        int  lastidx = 0;
        for(int  i = 0 ; i< nums.length ; i++){
            if(nums[0] != 0){
                int temp =  nums[i];
                nums[i] =  nums[lastidx];
                nums[lastidx] =  temp;
                lastidx++;
            }
        }
    }
}