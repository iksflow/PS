package boj.solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] d = new int[num + 1];
		System.out.println(solution(num, d));
	}
	
	public static int solution(int n, int[] d) {
		if (n == 1) {
			return 0;
		}
		if (d[n] > 0) {
			return d[n];
		} 
		d[n] = solution(n - 1, d) + 1;
		if (n % 2 == 0) {
			int temp = solution(n / 2, d) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		if (n % 3 == 0) {
			int temp = solution(n / 3, d) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		return d[n];
	}
}
