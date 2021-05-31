package leetcode;

import java.util.*;

public class P1704 {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {

        char[] arr = s.toLowerCase().toCharArray();
        int halfIdx = arr.length / 2;
        int count = 0;
        for (int i = 0; i < halfIdx; i++) {
            if (arr[i] == 'a' ||
                arr[i] == 'e' ||
                arr[i] == 'i' ||
                arr[i] == 'o' ||
                    arr[i] == 'u') {
                count ++;
            }
        }
        for (int i = halfIdx; i < arr.length; i++) {
            if (arr[i] == 'a' ||
                    arr[i] == 'e' ||
                    arr[i] == 'i' ||
                    arr[i] == 'o' ||
                    arr[i] == 'u') {
                count --;
            }
        }

        return count == 0;
    }
}
