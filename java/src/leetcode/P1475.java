package leetcode;

import java.util.Arrays;

public class P1475 {
    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }


    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j <prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }

        return prices;
    }
}
