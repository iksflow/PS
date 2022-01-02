package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0507 {
    public static void main(String[] args) {
//        [1,null,3,2,4,null,5,6]
        Node n6 = new Node(6);
        Node n5 = new Node(5);

        List<Node> l2 = new ArrayList<>();
        l2.add(n5);
        l2.add(n6);
        Node n3 = new Node(3, l2);
        Node n4 = new Node(4);
        Node n2 = new Node(2);
        List<Node> l1 = new ArrayList<>();
        l1.add(n3);
        l1.add(n4);
        l1.add(n2);
        Node n1 = new Node(1, l1);
        System.out.println(maxDepth(n1));
    }

    static int max = 0;
    public static int maxDepth(Node root) {
        dfs(root, 1);
        return max;
    }

    public static void dfs(Node node, int depth) {
        if (node.children == null) {
            max = Math.max(max, depth);
        } else {
            for (int i = 0; i < node.children.size(); i++) {
                dfs(node.children.get(i), depth + 1);
            }
        }
    }

}
