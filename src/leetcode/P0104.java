package leetcode;

public class P0104 {
    static int depth = 0;
    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n1 = new TreeNode(1, n2, n3);
        System.out.println(maxDepth(n1));
    }
    public static int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        if (root == null) {
            return 0;
        }
        left = maxDepth(root.left);
        right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

}
