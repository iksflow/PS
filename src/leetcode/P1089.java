package leetcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class P1089 {
    public static void main(String[] args) {
        int[] nums = {0,1,7,6,0,2,0,7};
        duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int tempIdx = 0;
        for (int i = 0; i < arr.length; i++) {

            if (tempIdx == arr.length) {
                break;
            }
            if (arr[i] == 0) {
                temp[tempIdx] = 0;
                tempIdx++;
            }
            if (tempIdx == arr.length) {
                break;
            }
            temp[tempIdx] = arr[i];
            tempIdx++;

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
