package leetcode;

public class P0367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
//        System.out.println(4193740 * 4193740);
    }

    public static boolean isPerfectSquare(int num) {
        long r = 1;
        while (r * r <= num) {
            if (r * r == num) {
                return true;
            } else {
                r++;
            }
        }
        return false;
    }
}
