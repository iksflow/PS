package boj.solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Date		: 2020. 3. 02.
 * @Problem Type: Queue
 * @Problem No. : 1158
 * @Problem Name: 요세푸스 문제
 * @Elapsed Time: 01:00:00
 */
public class P1158 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" ");
		int numOfPeople = Integer.parseInt(inputArr[0]);
		int rotationCount = Integer.parseInt(inputArr[1]); 
		System.out.println((solution(numOfPeople, rotationCount)));
		br.close();
	}

	public static String solution(int people, int count) {
		StringBuilder result = new StringBuilder();   
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < people; i++) {
			queue.offer(i + 1);	
		}
		result.append("<");
		while (!queue.isEmpty()) {
			for (int i = 0; i < count; i++) {
				if (i < count - 1) {
					queue.offer(queue.poll());	
				} else {
					result.append(queue.poll() + ", ");
				}
				
			}
		}
		result.delete(result.length() - 2, result.length());
		result.append(">");
		
		return result.toString();
	}
}
