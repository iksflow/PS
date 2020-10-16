package leetcode;

public class P0702 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            return (nums[0] == target) ? 0 : -1;
        }
        int res = -1;
        int start = 0;
        int end = nums.length - 1;
        int gap = end / 2;
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }

        while (start != end) {
            if (gap == 0) {
                break;
            }
            if (nums[start + gap] < target) {
                start += gap;
                gap = (end - start) / 2;
            } else if (target < nums[start + gap]) {
                end -= gap;
                gap = (end - start) / 2;
            } else {
                res = start + gap;
                break;
            }
        }

        return res;
    }

}
