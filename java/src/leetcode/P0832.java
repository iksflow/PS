package leetcode;

import java.util.Arrays;

public class P0832 {
    public static void main(String[] args) {
        System.out.println(0 ^ 1);
        int[][] matrix = {{1}};

        System.out.println(Arrays.toString(flipAndInvertImage(matrix)));
    }


    public static int[][] flipAndInvertImage(int[][] A) {
        if (A.length == 1) {
            A[0][0] ^= 1;
            return A;
        }
        int temp = -1;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Before::" + Arrays.toString(A[i]));
            for (int j = 0; j < A.length/2; j++) {
                temp = A[i][j] ^ 1;
                A[i][j] = A[i][A.length - j - 1] ^ 1;
                A[i][A.length - j - 1] = temp;
                if ((A.length & 1) == 1 && j == A.length/2 - 1) {
                    A[i][j + 1] = A[i][j + 1] ^ 1;
                }
            }
            System.out.println("After::" + Arrays.toString(A[i]));
        }

        return A;
    }
}
