package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P0046 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(next_permutation(next_permutation(num))));
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        return res;

    }

    public static List<Integer> next_permutation(int[] a) {
        int i = a.length - 1;
        while (i > 0 && a[i-1] >= a[i]) {
            i--;
        }

        if (i <= 0) {
            return Arrays.stream(a).boxed().collect(Collectors.toList());
        }

        int j = a.length - 1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length - 1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }

        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }
}
