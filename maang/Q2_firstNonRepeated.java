package maang;
import java.util.Scanner;

public class Q2_firstNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Answer: " + noRepeat(str));
    }

    public static String noRepeat(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                boolean unique = true;
                for (int j = 0; j < str.length(); j++) {
                    if (i != j && str.charAt(i) == str.charAt(j)) {
                        unique = false;
                        break;
                    }
                }
                if (unique) return String.valueOf(str.charAt(i));
            }
        }
        return "";
    }
}
