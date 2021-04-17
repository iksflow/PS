package leetcode;

import java.util.Arrays;

public class P1769 {
    public static void main(String[] args) {
        String boxes = "001011";
        System.out.println(Arrays.toString(minOperations(boxes)));

    }

    public static int[] minOperations(String boxes) {
        int[] boxArr = new int[boxes.length()];
        int len = boxes.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                int n = boxes.charAt(j) - '0';
                if (n == 1) {
                    boxArr[i] += Math.abs(i - j);
                }
            }
        }
        return boxArr;
    }
}
