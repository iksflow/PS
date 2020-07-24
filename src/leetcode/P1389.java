package leetcode;

import leetcode.util.PrintUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class P1389 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        PrintUtil.arrayPrinter(createTargetArray(nums, index));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            if (index[i] < list.size()) {
                list.add(index[i], nums[i]);
            } else {
                list.add(nums[i]);
            }
        }

        Integer[] temp = list.toArray(new Integer[list.size()]);
        for (int i = 0; i < temp.length; i++) {
            target[i] = temp[i];
        }
        return target;
    }
}
