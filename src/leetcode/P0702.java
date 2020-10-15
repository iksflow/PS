package leetcode;

public class P0702 {
    public static void main(String[] args) {
        int[] nums = {2, 5};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            return (nums[0] == target) ? 0 : -1;
        }

        int res = -1;
        int gap = nums.length / 2;
        int idx = gap;
        while (gap != 0) {
            gap /= 2;
            if (nums[idx] == target) {
                res = idx;
            } else if (nums[idx] < target) {
                idx += gap;
            } else {
                idx -= gap;
            }
        }
        return res;
    }

}
