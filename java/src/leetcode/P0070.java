package leetcode;

public class P0070 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }
/*
    D[1] = 1
    D[2] = D[1] + D[0]
    D[3] = D[2] + D[1]
    D[4] = D[3] + D[2]
    1111
    112
    121
    211
    22
    ...
    D[N] = D[N-1] + 1
*/

    public static int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 2;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n-1];
    }
}
