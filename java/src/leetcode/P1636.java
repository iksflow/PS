package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class P1636 {
    public static void main(String[] args) {
//        int[] nums = {1,1,2,2,2,3};
//        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        int[] nums = {2,3,1,3,2};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    /*
    * */
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> checkMap = new HashMap<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            checkMap.put(nums[i], checkMap.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> res = checkMap.entrySet().parallelStream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).thenComparing(Map.Entry::getKey, (o1, o2) -> o2.compareTo(o1)))
                .collect(Collectors.toList());

        System.out.println(res);
        int idx = 0;
        for (Map.Entry<Integer, Integer> re : res) {
            for (int i = 0; i < re.getValue(); i++) {
                result[idx] = re.getKey();
                idx++;
            }
        }

        return result;
    }
}
