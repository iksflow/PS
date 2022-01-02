package leetcode;

/* [Easy]Find Numbers with Even Number of Digits */
public class P1295 {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if (10 <= nums[i] && nums[i] < 100) {
                count++;
            } else if (1000 <= nums[i] && nums[i] < 10000) {
                count++;
            } else if (nums[i] == 100000) {
                count++;
            }

        }
        return count;
    }
}
