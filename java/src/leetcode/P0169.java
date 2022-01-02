package leetcode;

import java.util.HashMap;

public class P0169 {
    public static void main(String[] args) {
//        int[] nums = {4,5,4};
        int[] nums = {2,2,1,1,1,3,3};
        System.out.println(majorityElement(nums));
    }


//    public static int majorityElement(int[] nums) {
//        int len = nums.length;
//        int result = -1;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//
//        for (Integer key : map.keySet()) {
//            if (map.get(key) > len/2) {
//                result = key;
//                break;
//            }
//        }
//
//
//        return result;
//    }
    public static int majorityElement(int[] nums) {
        int major = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                major = nums[i];
                count ++;
            }else if(major == nums[i]) count++;
            else count--;
            System.out.println("[i = " + i + "] " + "major = " + major + ", count = " + count);
        }
        return major;
    }
}
