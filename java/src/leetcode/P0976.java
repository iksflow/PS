package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class P0976 {
    public static void main(String[] args) {
        int[] input = {3,2,3,4};
        System.out.println(largestPerimeter(input));
    }

    public static int largestPerimeter(int[] A) {
        int res = 0;
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        for (int i = A.length - 1; 0 <= i; i--) {
            int longest = A[i];
            for (int j = i - 2; 0 <= j; j--) {
                int others = A[j] + A[j + 1];
                if (others > longest) {
                    res = others + longest;
                    return res;
                }
            }
        }
        return res;
    }
}
