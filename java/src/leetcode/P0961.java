package leetcode;

import java.util.Arrays;

public class P0961 {
    public static void main(String[] args) {

    }

    public static int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int prev = -1;
        for (int i = 0; i < A.length; i++) {
            if (prev == A[i]) {
                return A[i];
            } else {
                prev = A[i];
            }
        }

        return 0;
    }
}
