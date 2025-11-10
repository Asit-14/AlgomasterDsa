package String;

import java.util.Arrays;

public class Q9_CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        checkAnagram(str1, str2); 

    }

    public static void checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char a1[] =  str1.toCharArray();
        char a2[] = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagram both String");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
