package leetcode;

public class P0509 {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }


    public static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        int[] memo = new int[31];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i < N; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[N-1];
    }
}
