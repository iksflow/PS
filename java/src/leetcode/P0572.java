package leetcode;

public class P0572 {
    public static void main(String[] args) {
        TreeNode s1 = new TreeNode(1);
        TreeNode s2 = new TreeNode(2);
        TreeNode s4 = new TreeNode(4, s1, s2);
        TreeNode s5 = new TreeNode(5);
        TreeNode s3 = new TreeNode(3, s4, s5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t4 = new TreeNode(5, t1, t2);
        System.out.println(isSubtree(s3, t4));
    }
    static TreeNode c = null;
    static boolean res = true;
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        search(s, t.val);
        if (c == null) {
            return false;
        }
        return res;
    }
    public static void search(TreeNode node, int target) {
        if (node == null) {
            return;
        } else {
            if (node.val == target) {
                c = node;
            }

            search(node.left, target);
            search(node.right, target);
        }
    }
    public static void isEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {

        } else if (t1 != null && t2 != null) {
            if (t1.val == t2.val) {
                isEqual(t1.left, t2.left);
                isEqual(t1.right, t2.right);
            } else {
                res = false;
            }
        } else {
            res = false;
        }
    }

}
