package String;

public class Q2_Valid_Palindrome {
    public static void main(String[] args) {

    }

    public boolean ispalindrom(String str) {
        String clean = str.replace.("[^A-Za-z0-9]", "").toLowerCase();
         return  clean.equalss(new StringBuilder(cleaned).reverse().toString());


    }
}
