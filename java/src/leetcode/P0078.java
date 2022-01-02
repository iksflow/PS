package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class P0078 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> list = new ArrayList<>();
        list = subsets(nums);
        for (List<Integer> n : list) {
            System.out.println(n);
        }
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> subSets = new ArrayList<>();
            for (List<Integer> n : res) {
                ArrayList<Integer> temp = new ArrayList<>(n);
                temp.add(nums[i]);
                subSets.add(temp);
            }
            for (List<Integer> n : subSets) {
                res.add(n);
            }
        }

        return res;
    }

}
