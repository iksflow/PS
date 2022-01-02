package leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P0046 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        int[] num2 = {1, 5, 4, 3, 2};
        int[] num3 = {0, -1, 1};
        int[] lastNum = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(next_permutation(num)));
//        System.out.println(hasNext(num2));
//        System.out.println(hasNext(lastNum));
        permute2(num);
//        for (List<Integer> l : permute2(num)) {
//            System.out.println(Arrays.toString(l.toArray()));
//        }

    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        while (hasNext(nums)) {
            nums = next_permutation(nums);
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        }
        return res;
    }

    public static boolean hasNext(int[] a) {
        int i = a.length - 2;
        while(i >= 0 && a[i] > a[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false;
        }

        return true;
    }

    public static int[] next_permutation(int[] a) {
        int[] res = Arrays.copyOf(a, a.length);
        int i = res.length - 2;
        while(i >= 0 && res[i] > res[i + 1]) {
            i--;
        }

        if (i < 0) {
            return a;
        }

        int j = res.length - 1;
        while(i < j && res[i] > res[j]) {
            j--;
        }
        swap(res, i, j);

        j = res.length - 1;
        while(i < j) {
            int temp = res[i + 1];
            res[i + 1] = res[j];
            res[j] = temp;
            j--;
            i++;
        }

        return res;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }


    public static List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        backtrack(nums,res,new ArrayList<>(), 0);
        return res;
    }

    public static void backtrack(int[] nums, List<List<Integer>> list, List<Integer> temp, int length) {

        if (length == nums.length) {
            list.add(new ArrayList<>(temp));
            System.out.println("PUSH: " + temp);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            System.out.println("ADD: " + temp);
            backtrack(nums, list, temp, length+1);
            temp.remove(temp.size() - 1);
            System.out.println("REMOVE: " + temp);
        }
    }

}
