package leetcode;

import java.util.Arrays;

public class P1304 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }

    public static int[] sumZero(int n) {
        int[] res = new int[n];
        if (n == 1) {
            res[0] = 0;
            return res;
        }
        if ((n & 1) == 1) {
            res[n/2] = 0;
        }
        for (int i = 0; i < n/2; i++) {
            res[i] = -1 - i;
            res[n-1-i] = 1 + i;
        }
        return res;
    }
}
