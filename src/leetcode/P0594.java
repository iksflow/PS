package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class P0594 {
    public static void main(String[] args) {
//        int[] nums = {1,3,2,2,5,2,3,7};
//        int[] nums = {1,2,2,1};
        int[] nums = {1,3,1,3,2,3,0,3,0,1,2,2,2,-1,2,1,0,0,2,2,3,-3,1,2,2,0,1,3,1};
        System.out.println(findLHS(nums));
    }


    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = count.getOrDefault(nums[i], 0) + 1;
            count.put(nums[i], value);
        }
        Integer[] arr = count.keySet().toArray(new Integer[count.size()]);
        int max = 0;
        int prev = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (prev != Integer.MAX_VALUE) {
                if (Math.abs(prev - curr) == 1) {
                    max = Math.max(max, count.get(prev) + count.get(curr));
                }
            }
            prev = curr;
        }
        return max;
    }
}
