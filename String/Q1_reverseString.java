package String;

public class Q1_reverseString {
    public static void main(String[] args) {
         String str = "Asit Kumar";
        String sb = new StringBuilder(str).reverse().toString();
        System.out.println(sb);
    }
}
