package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P0022 {
    public static void main(String[] args) {
        String temp = "((()))";

        System.out.println(isPairValid(temp.toCharArray()));
    }

    static char[] par = {'(', ')'};
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new char[n * 2], n * 2, 0);
        return res;
    }

    public static void backtrack(List<String> list, char[] temp, int n, int len) {
        if (len == n * 2 - 1) {
            temp[len] = ')';
            list.add(new String(temp));
            return;
        }

        for (int i = 0; i < n * 2; i++) {

            if (len == 0) {
                temp[0] = par[0];
            }
            if (isPairValid(temp)) {
//                continue
            }
            backtrack(list, temp, n, len + 1);

        }
    }

    public static boolean isPairValid(char[] arr) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                break;
            }

        }
        return true;
    }

}
