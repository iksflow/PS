package leetcode;

public class P0687 {
    public static void main(String[] args) {

    }


    public int longestUnivaluePath(TreeNode root) {
        temp(root, root.val, 0);
        return 0;
    }
    public void temp(TreeNode node, int preVal, int sum) {
        if (node == null) {
            return;
        } else {
            if (node.left.val == preVal) {
                sum++;
            } else {
                sum = 0;
            }
            temp(node.left, node.left.val, sum);
            if (node.right.val == preVal) {
                sum++;
            } else {
                sum = 0;
            }
            temp(node.left, node.left.val, sum);
        }

//        temp(node.right);

    }

}
