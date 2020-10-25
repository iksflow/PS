package leetcode;


import java.util.HashMap;

public class P1387 {
    public static void main(String[] args) {
        int lo = 12;
        int hi = 15;
        int k = 2;
        System.out.println(getKth(lo, hi, k));
        System.out.println(getStep(3));
//        Pair
    }

    /* 임의의 수 x가 1인 되는데 까지 걸리는데 몇 단계가 필요한지 구하는 방법은 다음과 같다.
    * x는 다음의 규칙으로 다음 수로 변하게된다.
    * x가 홀수인 경우 : x = 3 * x + 1
    * x가 짝수인 경우 : x = x / 2
    * 3개의 인자가 전달된다.
    * lo 부터 hi의 구간에 있는 모든 수들의 단계를 구한다음, 필요 단계가 적은 순서로 정렬한다.
    * 필요 단계가 적은 순서로 정렬된 상태에서 k번째에 있는 수가 무엇인지 구한다.
    * 1) 규칙대로 1을 만드는 로직을 작성한다.
    * 2) memoization 기법을 사용해 한번 구한 수는 캐시에서 갖다쓰는것으로 한다.
    * 3) lo부터 hi까지 모든 수들의 단계를 구한다.
    * 4) 구한 값들은 key(수) : value(단계)로 저장한다.
    * 5)
    * [lo ... hi] 의 수들*/
    public static int getKth(int lo, int hi, int k) {
        memo[1] = 0;
        memo[2] = 1;
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            int step = getStep(i);
            res.put(i, step);
        }
        System.out.println(res);
//        int step = getStep();
        return 0;
    }
    static int[] memo = new int[1001];

    public static int getStep(int x) {

        if (x == 1) {
            return 0;
        }
        if (memo[x] != 0) {
            return memo[x];
        }
        if ((x & 1) != 0) {
            return getStep(x * 3 + 1) + 1;
        } else {
            return getStep(x/2) + 1;
        }
    }
}
