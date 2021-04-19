package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class P1379 {
    public static void main(String[] args) {
//        getTargetCopy()
    }


    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int targetVal = target.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(cloned);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.val == targetVal) {
                return node;
            }
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }
        return null;
    }
}
