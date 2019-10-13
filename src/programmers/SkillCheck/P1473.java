package programmers.SkillCheck;

/**
 * @author : pro
 * @url : https://programmers.co.kr/skill_checks/56307?challenge_id=1473
 * 1 4		3 3		15 15
 * 3 2		3 3		15 15
 * 4 1				15 15
 */
public class P1473 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
		int [][] arr2 = {{3, 3}, {3, 3}};
		System.out.println(arr1.length);
		
//		solution(arr1, arr2);
	}
	
	public static int [][] solution(int [][] arr1, int [][] arr2) {
		int [][] answer = new int[arr1.length][arr2.length];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
//				if (answer[i][j] == null) {
//					answer[i][j] = 0;
//				}
//				answer[i][j] += 
			}
//			answer[i]
		}
		
		return answer;
	}
}
