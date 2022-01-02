package leetcode;

public class P0771 {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        for (char stone : stones) {
            for (char jewel : jewels) {
                if (jewel == stone) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
