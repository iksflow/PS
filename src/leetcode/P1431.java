package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 1431. Kids With the Greatest Number of Candies */
public class P1431 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        Long start = System.currentTimeMillis();
        System.out.println(Arrays.stream(candies).max().getAsInt());
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandyNum = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy > maxCandyNum) maxCandyNum = candy;
        }

        for (int i = 0; i < candies.length; i++) {
            if (maxCandyNum <= candies[i] + extraCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
