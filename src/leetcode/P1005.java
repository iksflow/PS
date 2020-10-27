package leetcode;

public class P1005 {
    public static void main(String[] args) {

    }
    // 1. A를 오름차순 정렬한다.
    /*
    * 1. A를 오름차순으로 정렬한다.
    * 2. i = [0, 1, 2...K]이고 A[i]의 값이 음수인 경우 -1을 곱한다.
    * 3-1. A[i]값이 음수이면서 i = K 일 때 : 합을 구하고 종료한다.
    * 3-2. A[i]값이 0인 경우 반복문을 종료하고 합계를 구한다.
    * 3-3. A[i]값이 0을 지나쳐서 0보다 큰 경우, k가 짝수라면 종료하고 합계를 구한다.
    * 3-4. A[i]값이 0을 지나쳐서 0보다 큰 경우, k가 홀수라면 0기준으로 가장 작은값을 음수로 바꾸고 종료한다. 그리고 합계를 구한다*/
    public int largestSumAfterKNegations(int[] A, int K) {
        return 0;
    }
}
