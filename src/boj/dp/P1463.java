package boj.dp;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Date		: 2020. 3. 3.
 * @Problem Type: DP 
 * @Problem No. : 1463
 * @Problem Name: 1로 만들기
 * @Elapsed Time: 
 */
public class P1463 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
//		System.out.println(solution(num));
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(solution(num));
	}
	
	public static int solution(int n) {
	
		int[] d = new int[100];
		if (n < 2) {
			return 0;
		}
		if (d[n] > 0) {
			return d[n];
		} 
		d[n] = solution(n - 1) + 1;
		if (n % 2 == 0) {
			int temp = solution(n / 2) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		if (n % 3 == 0) {
			int temp = solution(n / 3) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		return d[n];
	}
}
