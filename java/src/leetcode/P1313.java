package leetcode;

/* [Easy]Decompress Run-Length Encoded List */
public class P1313 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(decompressRLElist(nums));

    }
    public static int[] decompressRLElist(int[] nums) {

        int lastIndex = 0;
        int arrLen = 0;
        for (int i = 0; i < nums.length/2; i++) {
            arrLen += nums[2*i];
        }
        int[] result = new int[arrLen];
        for (int i = 0; i < nums.length/2; i++) {
            int freq = nums[2*i];
            int val = nums[2*i +1];
            for (int j = 0; j < freq; j++) {
                result[lastIndex] = val;
                lastIndex++;
            }
        }

        return result;
    }
}
