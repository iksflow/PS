package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class P0101 {
    public static void main(String[] args) {

    }

    String[] check = new String[100];

    public boolean isSymmetric(TreeNode root) {
        if (root.left.val == root.right.val) {
//            isSymmetric()
        } else {
            return false;
        }


        return true;
    }


    public void bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.isEmpty() == false) {
            TreeNode temp = queue.poll();
            if (temp != null) {
                queue.offer(temp.left);
                queue.offer(temp.right);
            }

        }
    }

    public void compareTree(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(t1);
        while (queue.isEmpty() == false) {
            TreeNode temp = queue.poll();
            if (temp != null) {


            }

        }
    }


    public void reverseTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            reverseTree(root.left);
            reverseTree(root.right);
        }
    }

}
