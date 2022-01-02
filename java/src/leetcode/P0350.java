package leetcode;

import java.util.*;

public class P0350 {
    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }

        Set<Integer> set1 = map1.keySet();
        Set<Integer> set2 = map2.keySet();

        Iterator<Integer> itr = set1.iterator();
        while(itr.hasNext()) {
            int key = itr.next();
            if (map2.containsKey(key)) {
                int min = Math.min(map1.get(key), map2.get(key));
                for (int i = 0; i < min; i++) {
                    list.add(key);
                }
            }
        }

        return list.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();

    }
}
