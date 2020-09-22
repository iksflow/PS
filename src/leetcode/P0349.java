package leetcode;

import java.util.*;

public class P0349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])) {
                set.add(nums1[i]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]) && !set2.contains(nums2[i])) {
                list.add(nums2[i]);
                set2.add(nums2[i]);
            }
        }
        int[] res = list.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();

        return res;
    }
}
