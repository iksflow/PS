package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class P1207 {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occur = new HashMap<>();
        HashMap<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            occur.put(arr[i], occur.getOrDefault(arr[i], 0) + 1);
        }
        Iterator<Integer> iter = occur.keySet().iterator();
        while(iter.hasNext()) {
            int value = iter.next();
            unique.put(occur.get(value), unique.getOrDefault(occur.get(value), 0) + 1);
        }

        Iterator<Integer> iter2 = unique.keySet().iterator();
        while(iter2.hasNext()) {
            int value = iter2.next();
            if (1 < unique.get(value)) {
                return false;
            }
        }

        return true;
    }
}
