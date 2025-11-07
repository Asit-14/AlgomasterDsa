package BitManipulation;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        if ((nums & 1) == 0) {
            System.out.print("Number is even :"+ nums);
        } else {
            System.out.println("Number  is  Odd "+ nums);
        }
    }
}
