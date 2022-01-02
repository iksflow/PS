package leetcode;

public class P1689 {
    public static void main(String[] args) {
        System.out.println(minPartitions("82734"));
    }


    public static int minPartitions(String n) {
        int max = 0;
        for (char c : n.toCharArray()) {
            max = Math.max(max, Character.getNumericValue(c));
        }
        return max;
    }
}
