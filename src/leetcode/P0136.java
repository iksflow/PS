package leetcode;

public class P0136 {
    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
//        System.out.println(2 ^ 1 ^ 2);
//        System.out.println(1 ^ 2 ^ 2);
        System.out.println(singleNumber(nums));

    }


    public static int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }

        return nums[0];
    }
}
