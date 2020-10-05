package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P0530 {
    public static void main(String[] args) {

    }
    public static int getMinimumDifference(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int res = Integer.MAX_VALUE;
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node != null) {
                valList.add(node.val);
                q.offer(node.left);
                q.offer(node.right);
            }
        }


        for (int i = 0; i < valList.size(); i++) {
            for (int j = i + 1; j < valList.size(); j++) {
                res = Math.min(res, Math.abs(valList.get(i) - valList.get(j)));
            }
        }
        return res;
    }
}
