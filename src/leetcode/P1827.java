package leetcode;

public class P1827 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 1};
        System.out.println(minOperations(nums));

    }

    public static int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            while (nums[i-1] >= nums[i]) {
                nums[i]++;
                count++;
            }

        }

        return count;
    }
}
