package String;

import java.util.HashMap;

public class Q8_CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        countFrequency(str);
    }

    public static void countFrequency(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (char c : mp.keySet()) {  
            System.out.println(c + " --> " + mp.get(c));
        }
    }
}
