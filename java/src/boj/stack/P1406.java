package boj.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Date		: 2020. 02. 28.
 * @Problem Type: Stack
 * @Problem No.	: 1406	
 * @Problem Name: 에디터
 * @Elapsed Time: 01:00:00
 */
public class P1406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputText = sc.nextLine();
		int numOfCommand = sc.nextInt();
		sc.nextLine();
		String[] commandArr = new String[numOfCommand];
		for (int i = 0; i < numOfCommand; i++) {
			commandArr[i] = sc.nextLine();
		}
		solution(inputText, commandArr);
		sc.close();
	}
	
	public static void solution(String text, String[] commands) {
		Stack<Character> leftOfCursor = new Stack<Character>();
		Stack<Character> rightOfCursor = new Stack<Character>();
		for (int i = 0; i < text.length(); i++) {
			leftOfCursor.push(text.charAt(i));
		}
		for (String command : commands) {
			switch(command.charAt(0)) {
				case 'L':
					if (!leftOfCursor.isEmpty()) {
						rightOfCursor.push(leftOfCursor.pop());	
					}
					break;
				case 'D':
					if (!rightOfCursor.isEmpty()) {
						leftOfCursor.push(rightOfCursor.pop());
					}
					break;
				case 'B':
					if (!leftOfCursor.isEmpty()) {
						leftOfCursor.pop();
					}
					break;
				case 'P':
					leftOfCursor.push(command.charAt(2));
					break;
			}
		}
		while (!leftOfCursor.isEmpty()) {
			rightOfCursor.push(leftOfCursor.pop());
		}
		while (!rightOfCursor.isEmpty()) {
			System.out.print(rightOfCursor.pop());
		}
	}
}
