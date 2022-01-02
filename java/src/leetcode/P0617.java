package leetcode;

import java.util.Stack;

public class P0617 {



    public static void main(String[] args) {

        TreeNode t1l = new TreeNode(1);
        TreeNode t1 = new TreeNode(2, t1l, null);

        TreeNode t2r = new TreeNode(7);
        TreeNode t2 = new TreeNode(5, null, t2r);
        TreeNode t3 = mergeTrees(t1, t2);
        System.out.println(t3.val);
        System.out.println(t3.left.val);
        System.out.println(t3.right.val);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        // 1. recursive
//        if (t1 == null)
//            return t2;
//        if (t2 == null)
//            return t1;
//        t1.val += t2.val;
//        t1.left = mergeTrees(t1.left, t2.left);
//        t1.right = mergeTrees(t1.right, t2.right);
//        return t1;
        // 2. iterative
        if (t1 == null)
            return t2;
        Stack<TreeNode[]> stack = new Stack <> ();
        stack.push(new TreeNode[] {t1, t2});
        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();
            if (t[0] == null || t[1] == null) {
                continue;
            }
            t[0].val += t[1].val;

            if (t[0].left == null) {
                t[0].left = t[1].left;
            } else {
                stack.push(new TreeNode[] {t[0].left, t[1].left});
            }

            if (t[0].right == null) {
                t[0].right = t[1].right;
            } else {
                stack.push(new TreeNode[] {t[0].right, t[1].right});
            }
        }
        return t1;
    }
}
