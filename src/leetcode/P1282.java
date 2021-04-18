package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class P1282 {
    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(groupThePeople(groupSizes));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        int len = groupSizes.length;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int size : groupSizes) {
            map.putIfAbsent(size, new ArrayList<>());
        }

        for (int i = 0; i < len; i++) {
            map.get(groupSizes[i]).add(i);
            if (map.get(groupSizes[i]).size() == groupSizes[i]) {
                result.add(map.get(groupSizes[i]));
                map.put(groupSizes[i], new ArrayList<>());
            }
        }


        return result;
    }
}
