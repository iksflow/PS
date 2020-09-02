package leetcode;

public class P1464 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 5};

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println();
            if (nums[i] > first) {
                second = first;
                first = nums[i];

                continue;
            }

            if (nums[i] > second) {
                second = nums[i];
            }
        }

        return (first - 1) * (second - 1);

    }
}
