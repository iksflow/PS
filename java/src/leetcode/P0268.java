package leetcode;

public class P0268 {
    public static void main(String[] args) {
        int[] nums1 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums1));
    }


    public static int missingNumber(int[] nums) {
        int res = 0;
        int[] check = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            check[nums[i]]++;
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == 0) {
                res = i;
                break;
            }
        }
        return res;
    }
}
