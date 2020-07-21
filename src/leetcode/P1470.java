package leetcode;

/* 1470. Shuffle the array */
public class P1470 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        System.out.println(shuffle(arr, 3));
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
