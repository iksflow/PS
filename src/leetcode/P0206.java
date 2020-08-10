package leetcode;

import java.util.Stack;

public class P0206 {
    public static void main(String[] args) {
/*      Input: 1->2->3->4->5->NULL
        Output: 5->4->3->2->1->NULL */
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode result = reverseList(l1);
//        ListNode result = reverseListRecursive(l1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;

        }

    }


    /* 1->2->3->NULL
     *  3->2->1->NULL
     * */

    // implementation with loop
    public static ListNode reverseList(ListNode head) {

        ListNode nextHead = head;
        ListNode reverse = null;
        while (nextHead != null) {
            ListNode temp = nextHead.next;
            nextHead.next = reverse;
            reverse = nextHead;
            nextHead = temp;

        }
        return reverse;
    }

    // implementation with recursive
    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
