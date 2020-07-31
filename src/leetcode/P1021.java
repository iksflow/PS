package leetcode;

import java.util.Stack;

public class P1021 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));

    }

    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int[] arr = new int[S.length()];

        for (int i = 0 ; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if (stack.empty()) {
                    arr[i] = 1;
                }
                stack.push(S.charAt(i));
            }
            if (S.charAt(i) == ')') {
                stack.pop();
                if (stack.empty()) {
                    arr[i] = 1;
                }
            }
        }

        for (int i = 0; i < S.length(); i++) {
            if (arr[i] != 1) {
                sb.append(S.charAt(i));
            }

        }

        return sb.toString();
    }
}
