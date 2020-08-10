package leetcode;

public class SearchTreeDepth {
    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n1 = new TreeNode(1, n2, n3);

        System.out.println(searchTreeDepth(n1));
    }

    public static int searchTreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(searchTreeDepth(root.left), searchTreeDepth(root.right)) + 1;
    }

}
