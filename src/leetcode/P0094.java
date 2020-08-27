package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P0094 {
    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);
        TreeNode t1 = new TreeNode(1, null, t2);
        for (Integer i : inorderTraversal(t1)) {
            System.out.println(i);
        }
    }

    static List<Integer> res = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            res.add(root.val);
            inorderTraversal(root.right);
        }
        return res;
    }
}
