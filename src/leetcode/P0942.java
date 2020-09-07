package leetcode;

import java.util.Arrays;

public class P0942 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("DDI")));
    }


    public static int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int max = S.length();
        int min = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                res[i] = min;
                min++;
            } else {
                res[i] = max;
                max--;
            }
        }
        res[S.length()] = max;

        return res;
    }
}
