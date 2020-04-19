package programmers.solving;

public class ClearLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("0123456789", "3333333333");
	}

	public static int solution(String p, String s) {
		int answer = 0;
		int size = p.length();
		for (int i = 0; i < size; i++) {
			int a = p.charAt(i) - 48;
			int b = s.charAt(i) - 48;
			int diff = Math.abs(a-b);
			if (5 < diff) {
				answer += 10 - diff;
			} else {
				answer += diff;
			}
			
		}
		
		
		return answer;
	}
}
