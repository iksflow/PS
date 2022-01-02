package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P1684 {
    public static void main(String[] args) {

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        Set<Character> set = new HashSet<Character>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        for (String word : words) {
            boolean isCons = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    isCons = false;
                    break;
                }
            }
            if (isCons) {
                result++;
            }
        }
        return result;
    }
}
