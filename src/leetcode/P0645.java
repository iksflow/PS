package leetcode;

import java.util.Arrays;

public class P0645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] res = findErrorNums(nums);
        System.out.println(Arrays.toString(res));
    }
    /* {1,2,3,4,5}
    * {1,2,3,4,2}
    * 5가 누락된 경우 어떻게 찾으면 될까?
    * 정렬
    * {1,2,3,4,5}
    * {1,2,2,3,4}
    * {1,2,3,4,5}
    * {1,1,3,4,5}*/
    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1]++;
            if (1 < arr[nums[i] - 1]) {
                res[0] = nums[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                res[1] = i + 1;
                break;
            }
        }

        return res;
    }
}
