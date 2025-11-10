package String;

import java.util.HashSet;

public class Q7_RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(removeduplicates(str));
    }

    public static String removeduplicates(String str) {
            HashSet<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) { 
            if (set.add(ch)) { 
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
