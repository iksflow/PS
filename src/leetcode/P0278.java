package leetcode;

public class P0278 {
    public static void main(String[] args) {
        int a = 1595065044;
        a -= a/2;
        System.out.println(a);
        System.out.println(firstBadVersion(2126753390));
    }
    public static int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        int res = 0;
        int next = n/2 + 1;



        return res;
    }

    public static boolean isBadVersion(int n) {
        return n >= 1702766719;
    }
}
