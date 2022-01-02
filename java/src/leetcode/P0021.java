package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/* Merge Two Sorted Lists */
public class P0021 {
    public static void main(String[] args) {
        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);
        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(1, b2);

        ListNode result = mergeTwoLists(a1, b1);
        System.out.println(result.toString());
        while (result != null) {
            System.out.println("result: " + result.val);

            result = result.next;
        }

    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        Queue<ListNode> q = new LinkedList<>();
        ListNode next = null;
        ListNode head = null;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                q.offer(l2);
                l2 = l2.next;
                continue;
            }
            if (l2 == null) {
                q.offer(l1);
                l1 = l1.next;
                continue;
            }
            if (l1.val < l2.val) {
                q.offer(l1);
                l1 = l1.next;
            } else {
                q.offer(l2);
                l2 = l2.next;
            }
        }

        while (q.isEmpty() == false) {


            if (head == null) {
                head = q.poll();
                next = head;
                continue;
            }
            next.next = q.poll();
            next = next.next;

        }

        return head;
    }
}