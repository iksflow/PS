package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1403 {
    public static void main(String[] args) {
        int[] nums = {6};
        System.out.println(minSubsequence(nums));
        System.out.println(14 < 14);
    }


    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        int minSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            minSum += nums[nums.length - 1 - i];
            sum -= nums[nums.length - 1 - i];
            res.add(nums[nums.length -1 -i]);
            if (sum < minSum) {
                break;
            }

        }

        return res;
    }
}
