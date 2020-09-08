package leetcode;

import java.util.Arrays;

public class P0977 {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }


    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)Math.pow(Math.abs(A[i]), 2);
        }
        Arrays.sort(A);
        return A;
    }
}
