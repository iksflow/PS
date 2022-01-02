package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String word = "USA";

        System.out.println(detectCapitalUse(word));

    }

    public static boolean detectCapitalUse(String word) {

        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(0) <= 90) {
                if (1 <= i && word.charAt(i) <= 90) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
