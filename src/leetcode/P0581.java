package leetcode;

import java.util.Arrays;

public class P0581 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(nums));
    }
    public static int findUnsortedSubarray(int[] nums) {
//        int[] org = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(nums);
//        int start = -1;
//        int end = -1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (org[i] != nums[i]) {
//                if (start < 0) {
//                    start = i;
//                }
//                end = i;
//            }
//        }
//
//        return end - start + 1;
//
        int len = nums.length;
        int i;
        if (len <= 1) return 0;

        int left, right;

        right = 0;
        int max = nums[0];
        for (i = 1; i < len; i++) {
            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }
        }

        if (right == 0) return 0;

        //[2, 6, 4, 8, 10, 9, 15]
        // [1, 3, 2] => right = 2, left = 1
        left = len - 1;
        int min = nums[len - 1];
        for (i = len - 2; i >= 0; i--) {
            if (nums[i] > min) {
                left = i;
            } else {
                min = nums[i];
            }
        }

        return right - left + 1;
    }
}
