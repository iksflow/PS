package programmers.skillcheck;

import java.time.LocalDate;

public class P1988 {

	public static void main(String[] args) {
		solution(5, 6);
		
	}
	
	public static void solution(int a, int b) {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
