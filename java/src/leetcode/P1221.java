package leetcode;

import java.util.Stack;

/* [Easy]Split a String in Balanced Strings */
public class P1221 {
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.peek() == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if (stack.peek() != s.charAt(i)) {
                stack.pop();
                if (stack.empty()) {
                    count++;
                }
            }
        }

        return count;
    }
}
