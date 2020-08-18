package leetcode;

import java.util.Arrays;

public class P0053 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {-2, -1};

        System.out.println(maxSubArray(nums));

    }

    /* D[n] = 길이가 n인 배열 a의, 부분배열 원소들을 합한 최대값;
    * D[0] = 0;     // 1
    * D[1] = a[0]   // 1
    * D[2] = max(a[0], a[1], a[0]+a[1])     // 3
    * D[3] = max(a[0], a[1], a[2], a[0]+a[1], a[0]+a[2], a[1]+a[2], a[0]+a[1]+a[2])     // 7
    * ...
    * 점화식 세워보자
    * D[0] = 0;     // 1
    * D[1] = a[0]   // 1
    * D[2] = max(D[1], a[1], D[1]+a[1])     // 3
    * D[3] = max(D[2], a[2], a[0]+a[2], a[1]+a[2], a[0]+a[1]+a[2])     // 7
    * ...
    * D[n] = MAX(nums[i] + nums[i+1] + ... + nums[i+n]
    * */

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (max <= sum) {
                    max = sum;
                }
            }

        }

        return max;
    }
//    FAIL - TIME EXCEED
//    public static int maxSubArray(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        int[] memo = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            memo[i] = getMaxValue(nums, i+1);
//        }
//        Arrays.sort(memo);
//
//        return memo[nums.length - 1];
//    }
//
//    public static int getMaxValue(int[] nums, int subLen) {
//        int max = nums[0];
//        for (int i = 0; i < nums.length - subLen + 1; i++) {
//            int curValue = 0;
//            for (int j = 0; j < subLen; j++) {
//                curValue += nums[i + j];
//            }
//            max = Math.max(max, curValue);
//        }
//
//        return max;
//    }

}
