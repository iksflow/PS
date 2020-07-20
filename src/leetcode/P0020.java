package leetcode;

import java.util.Stack;

/*Valid Parentheses*/
public class P0020 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(stack.empty()) {
              return false;
            } else if (c == ')') {
                if (stack.peek() =='(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (stack.peek() =='{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (stack.peek() =='[') {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        System.out.println(stack.toString());
        return stack.empty();
    }
}
