package leetcode;

public class P1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    static int[] memo = new int[40];

    public static int tribonacci(int n) {
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        return go(n);
    }

    public static int go(int n) {
        if (n == 0) {
            return memo[0];
        }
        if (n == 1) {
            return memo[1];
        }
        if (n == 2) {
            return memo[2];
        }
        if (memo[n] != 0) {
            return memo[n];
        } else {
            memo[n] = go(n-3) + go(n-2) + go(n-1);
            return memo[n];
        }
    }



}
