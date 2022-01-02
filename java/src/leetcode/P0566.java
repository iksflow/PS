package leetcode;

import java.util.Arrays;

public class P0566 {
    public static void main(String[] args) {
        int[][] nums = {{1,2}, {3,4}};
        int[][] res = matrixReshape(nums, 1, 4);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int numsLen = 0;
        int[] numsArr = new int[r * c];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                numsArr[numsLen] = nums[i][j];
                numsLen++;
            }
        }
        if (numsLen != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        int index = 0;
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                res[j][k] = numsArr[index];
                index++;
            }
        }
        return res;
    }
}
