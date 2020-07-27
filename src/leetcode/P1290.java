package leetcode;

import java.util.Stack;

/* [Easy]Convert Binary Number in a Linked List to Integer */
public class P1290 {
    public static void main(String[] args) {
        int result = 0;
        result <<= 1;
//        result += 1;
        System.out.println("answer: " + result);
    }

    public int getDecimalValue(ListNode head) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        while(head.next != null) {
            stack.push(head.val);
            head = head.next;
        }
        for (int i = 0; i < stack.size(); i++) {
            result += Math.pow(stack.pop(), i);
        }

        return result;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
