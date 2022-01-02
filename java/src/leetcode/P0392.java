package leetcode;

public class P0392 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0 ) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        int index = 0;
        char[] str = s.toCharArray();

        for (int i = 0; i < t.length(); i++) {
            if (str[index] == t.charAt(i)) {
                if (index == str.length - 1) {
                    return true;
                } else {
                    index++;
                }
            }

        }

        return false;
    }
}
