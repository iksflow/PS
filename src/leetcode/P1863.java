package leetcode;

public class P1863 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(subsetXORSum(nums));
    }

    // recursion....
    public static int subsetXORSum(int[] nums) {
        return backTrace(nums, 0, 0);
    }

    private static int backTrace(int[] nums, int index, int xorSum) {
        if(index==nums.length) {
            return xorSum;
        }

        return backTrace(nums, index+1, nums[index]^xorSum)
                +backTrace(nums, index+1, xorSum);
    }
}
