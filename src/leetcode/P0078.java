package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0078 {
    public static void main(String[] args) {

    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>();
            if (temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            res.add(temp);
        }
        return res;
    }

    public static void run() {

    }
}
