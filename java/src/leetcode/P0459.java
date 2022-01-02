package leetcode;


public class P0459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern( "ababa"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        boolean res = false;
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
            String p = sb.toString();
            if (len % p.length() == 0) {

                if (s.length() < (i + 1) * 2) {
                    res = false;
                    break;
                }
                if (s.replaceAll(p, "").length() == 0) {
                    res = true;
                    break;
                }
            }

        }

        return res;
    }
}
