package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class P1356 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));

    }

    public static int[] sortByBits(int[] arr) {
        Integer[] res = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(res, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        return Arrays.stream(res).mapToInt(Integer::intValue).toArray();
    }
}
