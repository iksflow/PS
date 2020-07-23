package leetcode;

/* [Easy]How Many Numbers Are Smaller Than the Current Number */
public class P1365 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.print("[");
        for (int n : result) {
            System.out.print(n + ", ");
        }
        System.out.print("]");

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        First Answer
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[j] < nums[i]) {
                        result[i]++;
                    }
                }
            }

        }

        return result;
    }
}
