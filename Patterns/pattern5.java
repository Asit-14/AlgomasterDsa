package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number  you  want to  print pattern :");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) { // rows
            for (int j = 1; j <= i; j++) { // columns
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
