package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class P0414 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                list.add(nums[i]);
            }
        }
        list.sort(Collections.reverseOrder());
        if (3 <= list.size()) {
            return list.get(2);
        } else {
            return list.get(0);
        }
    }
}
