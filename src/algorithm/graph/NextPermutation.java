package algorithm.graph;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] next = new int[nums.length];
        while (hasNextPermutation(nums)) {
            nums = nextPermutation(nums);
            System.out.println(Arrays.toString(nums));
        }

    }

    public static int[] nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int[] nextPerm = Arrays.copyOf(nums, nums.length);
        int i = nextPerm.length - 2;
        while(0 < i && nextPerm[i] > nextPerm[i + 1]) {
            i--;
        }
        int j = nextPerm.length - 1;

        while(i < j && nextPerm[j] < nextPerm[i]) {
            j--;
        }
        System.out.println("i : " + i + " | j : " + j);
        int temp = nextPerm[i];
        nextPerm[i] = nextPerm[j];
        nextPerm[j] = temp;
        j = nextPerm.length - 1;
        while(i < j) {
            temp = nextPerm[i + 1];
            nextPerm[i + 1] = nextPerm[j];
            nextPerm[j] = temp;
            i++;
            j--;
        }

        return nextPerm;
    }

    public static boolean hasNextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        int i = nums.length - 2;
        while(0 < i && nums[i] > nums[i + 1]) {
            i--;
        }
        int j = nums.length - 1;

        while(i < j && nums[j] < nums[i]) {
            j--;
        }

        if (i == 0 && j == 0) {
            return false;
        }
        return true;
    }

}
