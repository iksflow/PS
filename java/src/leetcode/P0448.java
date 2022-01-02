package leetcode;

import java.util.ArrayList;
import java.util.List;

/* [EASY] 448. Find All Numbers Disappeared in an Array
* 절대값을 활용해서 음수로 저장하는방식을 취하면 추가적인 변수 없이 해결이 가능하다.
* */
public class P0448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isExist = new boolean[nums.length];
        List<Integer> result = new ArrayList<>();

        for (int n : nums) {
            isExist[n-1] = true;
        }

        for (int i = 0; i < isExist.length; i++) {
            if (isExist[i] == false) {
                result.add(i+1);
            }
        }

        return result;


//        for (int num : nums) {
//            num = Math.abs(num);
//            if (nums[num - 1] > 0) {
//                nums[num - 1] = - nums[num - 1];
//            }
//        }
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                ans.add(i + 1);
//            }
//        }
//        return ans;
    }
}
