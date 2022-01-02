package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class P0700 {
    public static void main(String[] args) {


    }


    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            if (node.val == val) {
                return node;
            }
            if (node != null) {
                que.offer(node.left);
                que.offer(node.right);
            }

        }

        return null;
    }

}
