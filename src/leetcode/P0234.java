package leetcode;

import java.util.Stack;

public class P0234 {
    public static void main(String[] args) {
        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(1, l2);
        System.out.println(isPalindrome(l1));
    }
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode start = head;
        while (start != null) {
            stack.push(start.val);
            start = start.next;
        }
        start = head;
        while (start != null) {
            if (stack.pop() != start.val) {
                return false;
            }
            start = start.next;
        }
        return true;
    }
}
