package leetcode;

public class P0141 {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        boolean result = false;
        while(head != null) {
            if (head.val == -9999) {
                result = true;
                break;
            }
            head.val = -9999;
            head = head.next;
        }

        return result;
    }
}
