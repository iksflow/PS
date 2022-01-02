package leetcode;

import java.util.Arrays;

public class P1103 {
    public static void main(String[] args) {
        int canides = 10;
        int num_people = 3;
        int[] result = distributeCandies(canides, num_people);
        System.out.println(Arrays.toString(result));
    }

    /*
    * 1. 캔디를 나눠주는 총 횟수 (n + 1) * n/2 < candies 를 만족하는 n에 + 1 한값.
    * candies가 */
    public static int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int n = 1;
        while((n + 1) * n/2 < candies) {
            res[(n-1) % num_people] += n;
            n++;
        }
        res[(n-1) % num_people] += candies - (n * (n-1) / 2);
        return res;
    }
}
