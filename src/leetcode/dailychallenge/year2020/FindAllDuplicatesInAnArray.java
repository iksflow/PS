package leetcode.dailychallenge.year2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            nums[(((nums[i] % nums.length) == 0) ? nums.length - 1 : (nums[i] % nums.length) - 1)] += nums.length;

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums.length * 2) {
                result.add(i + 1);
            }

        }

        return result;
    }
}
