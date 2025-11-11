package String;

public class Q9_ReverseEachWord {
    public static void main(String[] args) {
        String s = "Raam is going to agra";
        
        String[] words = s.split(" ");
    
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        String res = String.join(" ", words);
        System.out.println(res);
    }
}
