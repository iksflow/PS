package leetcode;

import java.util.*;

public class P0501 {
    public static void main(String[] args) {

    }


    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        int max = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node != null){
                int value = map.getOrDefault(node.val, 0) + 1;
                max = Math.max(max, value);
                map.put(node.val, value);
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            Integer next = itr.next();
            if (next == max) {
                list.add(next);
            }
        }
        return list.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
    }
}
