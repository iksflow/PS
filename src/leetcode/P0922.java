package leetcode;

import java.util.Arrays;

public class P0922 {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }


    public static int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int evenIdx = 0;
        int oddIdx = 1;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                res[evenIdx] = A[i];
                evenIdx += 2;
            } else {
                res[oddIdx] = A[i];
                oddIdx += 2;
            }
        }

        return res;
    }
}
