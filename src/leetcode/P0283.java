package leetcode;

import sun.awt.windows.WPrinterJob;

import java.util.Arrays;

public class P0283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        int[] nums = {1, 2};
        moveZeroes(nums);

        for (int n : nums) {
            System.out.print(n);
        }

    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                continue;
            }
            nums[i - count] = nums[i];
        }
        for (int i = 1; i <= count; i++) {
            nums[nums.length - i] = 0;
        }

    }
}
