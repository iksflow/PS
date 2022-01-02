package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0160 {
    public static void main(String[] args) {
        ListNode c3 = new ListNode(5);
        ListNode c2 = new ListNode(4, c3);
        ListNode c1 = new ListNode(8, c2);

        ListNode a2 = new ListNode(1, c1);
        ListNode a1 = new ListNode(4, a2);



        ListNode b3 = new ListNode(1, c1);
        ListNode b2 = new ListNode(6, b3);
        ListNode b1 = new ListNode(5, b2);


        System.out.println(getIntersectionNode(a1, b1));
    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode result = null;
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                result = headB;
                break;
            }
            set.add(headB);
            headB = headB.next;
        }
        return result;
    }


}
