package leetcode;

import java.util.Arrays;

public class P1299 {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
            max = 0;
        }
        arr[arr.length - 1] = -1;

        return arr;
    }
}
