package leetcode;

import java.util.Arrays;

public class P0561 {
    public static void main(String[] args) {

    }


    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length/2; i++) {
            sum += nums[i * 2];
        }
        return sum;
    }
}
