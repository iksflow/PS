package leetcode;

public class P0938 {

    int result;

    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        result = 0;
        dfs(root, L, R);
        return result;
    }

    public void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (L <= node.val && node.val <= R) {
                result += node.val;
            }
            if (L < node.val) {
                dfs(node.left, L, R);
            }
            if (R > node.val) {
                dfs(node.right, L, R);
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

