package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date		: 2020. 3. 3.
 * @Problem Type: DP 
 * @Problem No. : 1463
 * @Problem Name: 1로 만들기
 * @Elapsed Time: 
 */
public class P1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(solution(num));
	}
	
	public static int solution(int target) {
		/*
		 * D[N] = N을 1로만드는 최소연산횟수
		 * D[N] 은 아래 3가지 중 최소값인 경우 1개로 표현할 수 있을것이다. 
		 * D[N] = D[N/3] + 1
		 * D[N] = D[N/2] + 1
		 * D[N] = D[N-1] + 1
		 * D[N] = MIN(D[N/3], D[N/2], D[N-1]) + 1;
		 * */
		int[] memo = new int[100];
		memo[1] = 0;
		if (target == 1) {
			return 0;
		}
		if (memo[target] > 0) {
			return memo[target];
		} else if (target % 2 == 0) {
			memo[target] = solution(target / 2) + 1; 
			return memo[target];
		} else if (target % 3 == 0) {
			memo[target] = solution(target / 3) + 1;
			return memo[target];
		} else {
			memo[target] = solution(target - 1) + 1;
			return memo[target];
		}
	}
}
