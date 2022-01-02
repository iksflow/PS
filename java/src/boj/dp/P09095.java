package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date		: 2020. 3. 10.
 * @Problem Type: DP
 * @Problem No. : 9095
 * @Problem Name: 1,2,3 더하기
 * @Elapsed Time: 00:07:00
 */
public class P09095 {

    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		int[] d = new int[1002];
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(solution(num, d));	
		}
    }
    
    /* 점화식
     * D[N] = D[N-1] + D[N-2] + D[N-3]
     */
    public static int solution(int n, int[] d) {
    	if (0 < d[n]) {
    		return d[n];
    	}
    	d[n] = solution(n-1, d) + solution(n-2, d) + solution(n-3, d);
    	return d[n];
    }
}
