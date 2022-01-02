package hackerrank;

import java.util.Arrays;
import java.util.List;
/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * problem name : Compare the Triplets
 * problem : 길이가 3인 배열인 a,b 가 존재한다. 
 * 각 배열의 같은 순서끼리 값을 비교한 다음 더 큰 값을 가지고있는 배열에게 1점을 부여한다.
 * 이는 [a, b]같이 길이가 2인 배열로 나타낸다. 
 * 높은 점수를 획득한 배열에게 0점부터 1점씩 증가시키면 된다.      
 */
public class CompareTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(5, 6, 7);
		List<Integer> b = Arrays.asList(3, 6, 10);
		System.out.println(compareTriplets(a, b));
	}
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> scoreBoard = Arrays.asList(0, 0);
		for(int i = 0; i < a.size(); i++) {
			if (a.get(i) != b.get(i)) {
				if (a.get(i) > b.get(i)) {
					scoreBoard.set(0, scoreBoard.get(0) + 1); 
				} else {
					scoreBoard.set(1, scoreBoard.get(1) + 1);
				}	
			}
		}
		return scoreBoard;
	}
}
