package String;

public class Q3_longest_common_prefix {
    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        
        Q3_longest_common_prefix obj = new Q3_longest_common_prefix();
        String res = obj.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + res);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) return "";
            }
        }
        return pre;
    }
}
