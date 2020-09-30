package leetcode;

import java.util.Arrays;

public class P0455 {
    public static void main(String[] args) {
        int[] children = {1, 2, 3};
        int[] cookies = {3};
        System.out.println(findContentChildren(children, cookies));

    }


    public static int findContentChildren(int[] g, int[] s) {
        int res = 0;
        int nextIndex = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {

            for (int j = nextIndex; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    res++;
                    nextIndex = j + 1;
                    break;
                }
            }

        }

        return res;
    }
}
