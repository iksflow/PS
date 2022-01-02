package boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @Date		: 2020. 02. 28.
 * @Problem Type: Stack
 * @Problem No.	: 1406	
 * @Problem Name: 에디터
 * @Elapsed Time: 01:00:00
 */
public class P1406v2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputText = br.readLine();
		int numOfCommand = Integer.parseInt(br.readLine());
		String[] commandArr = new String[numOfCommand];
		for (int i = 0; i < numOfCommand; i++) {
			commandArr[i] = br.readLine();
		}
		solution(inputText, commandArr);
	}
	
	public static void solution(String text, String[] commands) {
		Stack<Character> leftOfCursor = new Stack<Character>();
		Stack<Character> rightOfCursor = new Stack<Character>();
		for (int i = 0; i < text.length(); i++) {
			leftOfCursor.push(text.charAt(i));
		}
		for (String command : commands) {
			if (command.charAt(0) == 'L') {
				if (!leftOfCursor.isEmpty()) {
					rightOfCursor.push(leftOfCursor.peek());	
					leftOfCursor.pop();
				}
			} else if (command.charAt(0) == 'D') {
				if (!rightOfCursor.isEmpty()) {
					leftOfCursor.push(rightOfCursor.peek());
					rightOfCursor.pop();
				}
			} else if (command.charAt(0) == 'B') {
				if (!leftOfCursor.isEmpty()) {
					leftOfCursor.pop();
				}
			} else if (command.charAt(0) == 'P') {
				leftOfCursor.push(command.charAt(2));
			}
		}
		while (!leftOfCursor.isEmpty()) {
			rightOfCursor.push(leftOfCursor.peek());
			leftOfCursor.pop();	
		}
		while (!rightOfCursor.isEmpty()) {
			System.out.print(rightOfCursor.pop());
		}
	}
}
