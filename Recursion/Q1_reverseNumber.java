package Recursion;

public class Q1_reverseNumber {

    public static void main(String[] args) {
        int a = 5;
        fun(a);
    }

    static void fun(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        num = num - 1;
        fun(num);
    }
}