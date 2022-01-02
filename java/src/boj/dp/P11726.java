package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date		: 2020. 3. 8.
 * @Problem Type: DP
 * @Problem No. : 11726
 * @Problem Name: 2xn 타일링
 * @Elapsed Time: 00:19:34
 */
public class P11726 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] d = new int[num + 2];
		System.out.println(solution(num, d));
	}
	/* D[N] = 2xn 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수
	 * D[N] = D[N-1] + D[N-2]
	 * 
	 */
	public static int solution(int n, int[] d) {
		int result = 0;
		d[1] = 1;
		d[2] = 2;
		if (n < 3) {
			return d[n];
		}
		if (d[n] > 0) {
			return d[n];
		}
		d[n] = solution(n-1, d) + solution(n-2, d);
		result = d[n];
		
			
		return result % 10007;
	}
}
