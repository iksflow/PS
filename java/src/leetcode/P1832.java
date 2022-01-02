package leetcode;

public class P1832 {
    public static void main(String[] args) {
        System.out.println('a' - 'a');
    }

    public static boolean checkIfPangram(String sentence) {
        int [] check = new int[26];
        if (sentence.length() < 26) {
            return false;
        }
        for (char c : sentence.toCharArray()) {
            check[c - 'a']++;
        }

        for (int n : check) {
            if (n == 0) {
                return false;
            }
        }
        return true;
    }
}
