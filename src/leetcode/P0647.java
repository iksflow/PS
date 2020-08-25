package leetcode;

public class P0647 {
    public static void main(String[] args) {
        String s = "ababa";
        String s2 = "abcd";
        System.out.println(countSubstrings(s));
//        System.out.println(s2.substring(0, 4));
    }

/* string = "ababa"
* dp[0] = 1 ["a"]
* dp[1] = 2 ["a", "b"]
* dp[2] = 4 ["a", "b", "a", "aba"]
* dp[3] = 6 ["a", "b", "a", "aba", "b", "bab"]
* dp[4] = 9 ["a", "b", "a", "aba", "b", "bab", "a", "aba", "ababa"]
* */

    public static int countSubstrings(String s) {
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i = 1; i < s.length(); i++) {
            for (int j = 0; j < s.length() - 1; j++) {

            }
            dp[i] = dp[i - 1] + countPalindrome(s.substring(0, i + 1));
        }
        return dp[s.length() - 1];
    }

    public static int countPalindrome(String s) {
        int count = 0;
        int len = s.length();
        for (int i = s.length() - 1; 0 <= i; i--) {
            boolean isPalindrome = true;
            String substring = s.substring(i, len);
            for (int j = 0; j < substring.length()/2; j++) {
                if (substring.charAt(j) != substring.charAt(substring.length() -1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) count++;
        }
        return count;
    }
}
