package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class P0290 {
    public static void main(String[] args) {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }


    public static boolean wordPattern(String pattern, String s) {
        Stack<Character> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Set<Character> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        String[] arr = s.split(" ");

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (stack1.empty()) {
                stack1.push(c);
            } else {
                if (stack1.peek() == c) {
                    stack1.pop();
                } else {
                    stack1.push(c);
                }
            }
            if (!set1.contains(c)) {
                set1.add(c);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (stack2.empty()) {
                stack2.push(arr[i]);
            } else {
                if (stack2.peek().equals(arr[i])) {
                    stack2.pop();
                } else {
                    stack2.push(arr[i]);
                }
            }
            if (!set2.contains(arr[i])) {
                set2.add(arr[i]);
            }
        }

        return (stack1.size() == stack2.size() && set1.size() == set2.size());
    }
}
