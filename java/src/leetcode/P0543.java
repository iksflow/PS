package leetcode;

// corner case : [4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
public class P0543 {

    static int max = 0;

    public static void main(String[] args) {

        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n1 = new TreeNode(1, n2, n3);
;
        System.out.println(diameterOfBinaryTree(n1));
    }


    public static int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return max;
    }

    public static int getDepth(TreeNode root) {
        int left = 0;
        int right = 0;

        if (root == null) {
            return 0;
        }
        left = getDepth(root.left);
        right = getDepth(root.right);
        max = Math.max(max, (left + right));
        return Math.max(left, right) + 1;

    }
}
