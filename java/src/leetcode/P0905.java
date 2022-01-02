package leetcode;

import java.util.Arrays;

public class P0905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }


    public static int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int index = 0;
        for(int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                res[index] = A[i];
                index++;
            }
        }

        for(int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 1) {
                res[index] = A[i];
                index++;
            }
        }

        return res;
    }
}
