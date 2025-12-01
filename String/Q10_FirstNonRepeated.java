package String;

public class Q10_FirstNonRepeated {
    public static void main(String[] args) {
        String s = "swisss";
        for(char ch : s.toCharArray()){
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
}
