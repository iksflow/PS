package leetcode;

public class P0326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
    }


    public static boolean isPowerOfThree(int n) {
        boolean res = true;
        if (n < 1) {
            return false;
        }
        while(0 < n) {

            if (n == 1) {
                break;
            }
            if (n % 3 == 0) {
                n /= 3;
            } else {
                res = false;
                break;
            }
        }

        return res;
    }
}
