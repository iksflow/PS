package leetcode;

import java.util.Arrays;

public class P1502 {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int[] arr2 = {-68,-96,-12,-40,16};
        System.out.println(canMakeArithmeticProgression(arr));
        System.out.println(canMakeArithmeticProgression(arr2));

    }


    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        System.out.println("sorted: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }
}
