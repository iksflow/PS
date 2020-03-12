package programmers.skillcheck;

import java.time.LocalDate;

public class P978 {
	public static void main(String[] args) {
		System.out.println(solution(5, 24));
		
	}
	
	public static String solution(int a, int b) {
		LocalDate targetDate = LocalDate.of(2016, a, b);
		String answer = String.valueOf(targetDate.getDayOfWeek()).substring(0, 3);
		return answer;
	}
}
