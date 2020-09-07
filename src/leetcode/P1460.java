package leetcode;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class P1460 {
    public static void main(String[] args) {
        int[] target = {3,7,11};
        int[] arr = {3,7,11};
        System.out.println(canBeEqual(target, arr));
    }


    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
