package leetcode;

public class P1822 {
    public static void main(String[] args) {
        int[] nums = {1,5,0,2,-3};
        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int n : nums) {
            if (n == 0) {
                return 0;
            }
            if (n < 0) {
                sign *= -1;
            }
        }
        return sign;
    }
}
