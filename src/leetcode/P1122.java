package leetcode;

import java.util.Arrays;

public class P1122 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }


    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int idx = 0;
        boolean[] check = new boolean[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (check[j] == false) {
                    if (arr2[i] == arr1[j]) {
                        res[idx] = arr1[j];
                        idx++;
                        check[j] = true;
                    }
                }
            }
        }
        int[] temp = new int[arr1.length - idx];
        int tIdx = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i] == false) {
                temp[tIdx] = arr1[i];
                tIdx++;
            }
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            res[idx] = temp[i];
            idx++;
        }

        return res;
    }
}
