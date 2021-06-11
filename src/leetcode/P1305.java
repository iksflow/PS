package leetcode;

import java.util.*;

public class P1305 {
    public static void main(String[] args) {

    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(root1);
        while (!q1.isEmpty()) {
            TreeNode node = q1.poll();
            if (node != null) {
                result.add(node.val);
                q1.add(node.left);
                q1.add(node.right);
            }
        }
        Collections.sort(result);
        return result;
    }
}
