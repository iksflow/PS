package leetcode;

import java.util.Stack;

public class P1021 {
    public static void main(String[] args) {


    }

    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        int[] arr = new int[S.length()];
        int lcount = 0;
        int rcount = 0;
        for (int i = 0 ; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if (0 < lcount) {

                } else {
                    lcount++;
                }

            }
            if (S.charAt(i) == ')') {
//                count--;
            }

        }

        return "";
    }
}
