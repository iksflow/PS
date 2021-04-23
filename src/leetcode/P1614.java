package leetcode;

import java.util.Stack;

public class P1614 {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charr = s.toCharArray();
        int max = 0;
        for (char c : charr) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                stack.pop();
            }
            max = Math.max(max, stack.size());
        }

        return max;
    }
}
