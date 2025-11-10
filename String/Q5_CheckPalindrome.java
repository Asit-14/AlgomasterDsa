package String;

public class Q5_CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        Boolean rev = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(rev);
    }
}
