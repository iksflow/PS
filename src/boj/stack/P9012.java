package boj.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Date		: 2020. 2. 25.
 * @Problem Type: Stack
 * @Problem No. : 9012
 * @Problem Name: 괄호
 * @Elapsed Time: 00:11:22
 */
public class P9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfInput = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numOfInput; i++) {
			System.out.println(solution(sc.nextLine()));
		}
		sc.close();
	}
	
	public static String solution(String ps) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < ps.length(); i++) {
			char word = ps.charAt(i);
			if (word == '(') {
				stack.push(word);
			} else if(word == ')') {
				if (0 < stack.size()) {
					stack.pop();	
				} else {
					result = "NO";
					return result;
				}
			} else {
				
			}
		}
		
		if (0 < stack.size()) {
			result = "NO";
		} else {
			result = "YES";
		}
		return result;
	}
}
