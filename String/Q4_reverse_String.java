package String;

public class Q4_reverse_String {
    public static void main(String[] args) {
        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        
        reverseStr(str);  // reverses in place
        
        // print the reversed string
        System.out.println(str);
    }

    public static void reverseStr(char[] str) {
        int n = str.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = str[i];
            str[i] = str[n - 1 - i];
            str[n - 1 - i] = temp;
        }
    }
}
