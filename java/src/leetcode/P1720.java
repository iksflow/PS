package leetcode;

import java.util.Arrays;

public class P1720 {
    public static void main(String[] args) {
        int x = 2;
        // 4 ^ 6= 6 ^ x
        // encoded[i] = arr[i] ^ arr[i + 1]
        // 6 = 4 ^ 2
        // encoded[0] = arr[0] ^ x
        // encoded[0] ^ arr[0] = x
        int[] encoded = { 6, 2, 7, 3 };
        int first = 4;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }

        return result;
    }
}
