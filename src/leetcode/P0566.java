package leetcode;

public class P0566 {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
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
        for (int i = 0; i < numsArr.length; i++) {
//            numsArr[i];

        }
        return null;
    }
}
