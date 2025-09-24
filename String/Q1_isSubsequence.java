package String;

public class Q1_isSubsequence {
    
    public static void main(String[] args) {
        String s = "xyz", t = "ahbgdc";
        boolean res = isSubsequence(s, t);
        System.out.println(res);
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length(); 
    }
}
