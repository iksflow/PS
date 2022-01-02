package leetcode;

public class P0121 {
    public static void main(String[] args) {
//        int[] nums = {7,6,4,3,1};
        int[] nums = {2,1,2,1,0,1,2};
        System.out.println(maxProfit(nums));
    }

    // my answer
//    public static int maxProfit(int[] prices) {
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int diff = prices[j] - prices[i];
//                if (diff > 0) {
//                    max = Math.max(max, diff);
//                }
//            }
//
//        }
//        return max;
//    }
    // best way
    public static int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int highestPrice = 0;
        // so far, prices[0] to prices[i]
        // best price: higest - lowest
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int value = prices[i];
            if (value < lowestPrice) {
                lowestPrice = value;
                highestPrice = value;
            }
            if (value > highestPrice) {
                highestPrice = value;
                maxProfit = Integer.max(highestPrice - lowestPrice, maxProfit);
            }
        }
        return maxProfit;
    }
}
