package leetcode;

public class P0441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(2147483647));
    }



    public static int arrangeCoins(int n) {
        int res = 0;
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            if (n < sum) {
                break;
            }
            res++;
        }
        return res;
    }
}
