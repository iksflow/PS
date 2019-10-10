package hackerRank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int introTutorial(int V, int[] arr) {
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			if (V == arr[i]) {
				answer = i;
				break;
			}
		}
		
		return answer;
	}

}
