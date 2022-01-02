package boj.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Date		: 2020. 2. 25.
 * @Problem Type: Stack
 * @Problem No. : 1874
 * @Problem Name: 스택수열
 * @Elapsed Time: 00:54:02
 */
public class P1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		sc.nextLine();
		int[] array = new int[numOfInput]; 
		for (int i = 0; i < numOfInput; i++) {
			array[i] = (sc.nextInt());
		}
		System.out.println(solution(array));
		

	}
	
	public static String solution(int[] input) {
		String result = "";
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int lastNum = 0;
		for (int num : input) {
			if (lastNum < num) {
				while (lastNum < num) {
					stack.push(++lastNum);	
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				if (stack.peek() == num) {
					stack.pop();
					sb.append("-\n");
				} else {
					result = "NO";
					return result;
				}
			}
		}
		result = sb.toString();
		
		return result;
	}
}
