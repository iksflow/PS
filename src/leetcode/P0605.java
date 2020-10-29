package leetcode;

import java.util.Arrays;

public class P0605 {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
    /*
    * 101
    * 1001
    * 10001
    * 00101
    * 01010*/
    /* 현재 인덱스(i)의 화분자리 값이
    * 0인 경우
    * - i - 1의 값이 1인 경우
    * > continue;
    * - i - 1의 값이 0인 경우
    *
    * - i + 1의 값이 1인 경우
    * > 불가능한자리이므로 패스
    * - i + 1의 값이 1이 아닌경우
    * result++을 하고 i + 1 의 값을 1로 변경한다.
    * 1인 경우
    * continue 한다.
    * - 값이 1이 아닐것*/
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int res = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] != 0) {
                continue;
            }
            // check prev bed
            if (0 <= i - 1) {
                if (flowerbed[i - 1] == 1) {
                    continue;
                }
            }
            // check next bed
            if (i + 1 <= flowerbed.length - 1) {
                if (flowerbed[i + 1] == 1) {
                    continue;
                } else {
                    flowerbed[i + 1] = 2;
                    res++;
                    continue;
                }
            }

            res++;
        }
        return n <= res;
    }
}
