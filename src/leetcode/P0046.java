package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P0046 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int[] num2 = next_permutation2(num);
        int[] num3 = next_permutation2(num2);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));

//        int[] num2 = next_permutation2(num);
//        int[] num3 = next_permutation2(num2);
//        System.out.println(Arrays.toString(next_permutation3(num)));
//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(num2));
//        System.out.println(Arrays.toString(num3));
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        return res;

    }
    public static int[] next_permutation2(int[] a) {
        int[] res = Arrays.copyOf(a, a.length);
        int i = res.length - 2;
        while(i > 0 && res[i] > res[i + 1]) {
            i--;
        }

        int j = a.length - 1;
        while(i < j && res[i] > res[j]) {
            j--;
        }
        swap(res, i, j);

        while(i < res.length - 2) {
            int temp = res[i + 1];
            res[i + 1] = res[i + 2];
        }

        return res;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

//    public static List<Integer> next_permutation(int[] a) {
//        int i = a.length - 1;
//        while (i > 0 && a[i-1] >= a[i]) {
//            i--;
//        }
//
//        if (i <= 0) {
//            return Arrays.stream(a).boxed().collect(Collectors.toList());
//        }
//
//        int j = a.length - 1;
//        while (a[j] <= a[i-1]) {
//            j -= 1;
//        }
//
//        int temp = a[i-1];
//        a[i-1] = a[j];
//        a[j] = temp;
//
//        j = a.length - 1;
//        while (i < j) {
//            temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//            i += 1;
//            j -= 1;
//        }
//
//        return Arrays.stream(a).boxed().collect(Collectors.toList());
//    }
    public static int[] next_permutation3(int[] a) {
        int i = a.length - 1;
        while (i > 0 && a[i-1] >= a[i]) {
            i--;
        }

        if (i <= 0) {
            return a;
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

        return a;
    }
}
