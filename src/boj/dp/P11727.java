package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date		: 2020. 3. 9.
 * @Problem Type: DP
 * @Problem No. : 11727
 * @Problem Name: 2xn 타일링2
 * @Elapsed Time: 00:07:05
 */
public class P11727 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] d = new int[1002];
		System.out.println(solution(num, d));
	}
	/* 2×n 직사각형을 2×1(가로, 세로)과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
	 * D[N] = D[N-1] + D[N-2] + D[N-2]
	 * D[1] = 1
	 * D[2] = 3
	 * D[3] = D[2] + D[1] + D[1]
	 */
	
	public static int solution(int n, int[] d) {
		int result = 0;
		d[1] = 1;
		d[2] = 3;
		if (n < 3) {
			return d[n];
		}
		if (d[n] > 0) {
			return d[n];
		}
		d[n] = solution(n - 1, d) + (solution(n - 2, d) * 2) ;
		d[n] = d[n] % 10007;
		result = d[n];
		return result;
	}
}
