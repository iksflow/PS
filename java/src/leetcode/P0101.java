package leetcode;

import java.util.*;

public class P0101 {
    public static void main(String[] args) {
//        TreeNode t7 = new TreeNode(3);
//        TreeNode t6 = new TreeNode(4);
//        TreeNode t5 = new TreeNode(4);
//        TreeNode t4 = new TreeNode(3);
//        TreeNode t3 = new TreeNode(2, t6, t7);
//        TreeNode t2 = new TreeNode(2, t4, t5);
//        TreeNode t1 =

        TreeNode t15 = new TreeNode(8);
        TreeNode t14 = new TreeNode(9);
        TreeNode t13 = new TreeNode(0);
        TreeNode t12 = new TreeNode(0);
        TreeNode t11 = new TreeNode(9);
        TreeNode t10 = new TreeNode(8);
        TreeNode t9 = new TreeNode(0);
        TreeNode t8 = new TreeNode(0);

        TreeNode t7 = new TreeNode(4, t14, t15);
        TreeNode t6 = new TreeNode(5, t12, t13);
        TreeNode t5 = new TreeNode(5, t10, t11);
        TreeNode t4 = new TreeNode(4, t8, t9);
        TreeNode t3 = new TreeNode(3, t6, t7);
        TreeNode t2 = new TreeNode(3, t4, t5);
        TreeNode t1 = new TreeNode(2, t2, t3);
        System.out.println(isSymmetric(t1));
    }

    public static boolean isSymmetric(TreeNode root) {
//        List<Integer> nodeList = bfs(root);
//        int treeLevel = 1;
//        int startIndex = 0;
//        int endIndex = 0;
//        while (Math.pow(2, treeLevel) - 1 < nodeList.size
//        ()) {
//            treeLevel++;
//        }
//        System.out.println("treeLevel: " + treeLevel);
//
//        for (int i = 0; i < treeLevel; i++) {
//            startIndex
//        }
        return false;
    }


    public static List<Integer> bfs(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.isEmpty() == false) {
            TreeNode temp = queue.poll();

            if (temp != null) {
                result.add(temp.val);
                if (temp.left != null || temp.right != null) {
                    queue.offer(temp.left);
                    queue.offer(temp.right);
                }
            } else {
                result.add(null);
            }

        }

        return result;
    }
}
