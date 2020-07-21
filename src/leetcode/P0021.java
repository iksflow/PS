package leetcode;
/* Merge Two Sorted Lists */
public class P0021 {
    public static void main(String[] args) {

    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1.next != null) {
            if (l1.next == null) {
                l1.next = l2;
            }
        }






        return result;
    }
}