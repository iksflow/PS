package leetcode;

public class P0263 {
    public static void main(String[] args) {
        System.out.println(isUgly(11));
    }

    public static boolean isUgly(int num) {
        boolean res = false;
        if (num == 1) {
            return true;
        }
        if (num <= 0) {
            return false;
        }
        if (num % 2  == 0) {
            res = isUgly(num/2);
        } else if (num % 3 == 0) {
            res = isUgly(num/3);
        } else if (num % 5 == 0) {
            res = isUgly(num/5);
        } else {
            res = false;
        }

        return res;
    }
}
