package leetcode;

public class P1688 {
    public static void main(String[] args) {

    }

    public static int numberOfMatches(int n) {
        int match = 0;
        while (1 < n) {
            match += (n / 2);
            if ((n & 1) == 1) {
                n = (n / 2) + 1;
            } else {
                n = n / 2;
            }
        }
        return match;
    }
}
