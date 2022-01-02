package leetcode;

public class P0338 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(5 ^ 0);
    }

    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        // 홀수 짝수 이용

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) res[i] = res[i / 2];
            else res[i] = 1 + res[i-1];
        }
        return res;
    }
}
