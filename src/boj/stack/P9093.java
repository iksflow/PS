package boj.stack;

import java.util.Scanner;
import java.util.Stack;

public class P9093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int textCnt = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < textCnt; i++) {
			String line = sc.nextLine();
			line += " ";
			 System.out.println(solution(line));	
		}
	}
	
	public static String solution(String word) {
		int stackSize = 0;
		Stack<Character> stack = new Stack<Character>();
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				stackSize = stack.size();
				for (int j = 0; j < stackSize; j++) {
					result.append(stack.pop());	
				}		
				result.append(' ');
			} else {
				stack.push(word.charAt(i));
			}
				
		}
		
		System.out.println("result : " + result.toString());
		
		
		 return result.toString();
	}
}
