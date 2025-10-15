package maang;

import java.util.Scanner;

public class Q1_reverseString {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the  String  to  Reverse : ");
    //     String str = sc.nextLine();
    //      System.out.print("the Reverse  String is : ");
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         System.out.print(str.charAt(i));
    //     }
    //     sc.close();
    // }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String to reverse : ");
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    sb.reverse();
    System.out.print("the Reverse String : ");
    System.out.println(sb);
}
}
