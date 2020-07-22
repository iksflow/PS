package leetcode;

public class P1470 {
    public static void main(String[] args) {

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i+n];
        }
        return result;
    }
}
