package leetcode;

import java.util.Stack;

public class P1309 {
    public static void main(String[] args) {
        char a = '1';
        char b = 'j' + 3;
        char c = '0' + 2 * 10 + 48;
        System.out.println(freqAlphabets("10#11#12"));
//        System.out.println(a + 0);
    }


    public static String freqAlphabets(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        char current = '@';
        for (int i = arr.length - 1; 0 <= i; i--) {
            if (arr[i] == '#') {
//                arr[i-2] + arr[i-1];
                char head = arr[i-2];
                char foot = arr[i-1];
                current = (char)(foot + 48 + (head - 48) * 10);
                i = i - 2;
            } else {
                current = (char)(arr[i] + 48);
            }
            sb.append(current);
        }
        return sb.reverse().toString();
    }
}
