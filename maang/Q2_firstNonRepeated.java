package maang;

import java.util.Scanner;

public class Q2_firstNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  String : ");
        String str = sc.nextLine();
        System.out.println("Answer  "+ noprepeat(str));
    }

    public static String noprepeat(String str) {
        String res = "";
       

        for (int i = 0; i < str.length(); i++) {
             int count = 0;
            if (str.charAt(i) != " ") {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    res += str.charAt(i);
                    break;
                }
            }
        }
        return res;
    }
}
