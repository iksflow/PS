package leetcode;

public class P1588 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    // [1, 4, 2, 5, 3]
    // [1, 2]
    // n = 1, s = 1, o = 1
    // n = 2, s = 3, o = 2
    // n = 3, s = 6, o = 4
    // n = 4, s = 10, o = 6
    // n = 5, s = 15, o = 9
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int t = ((arr.length & 1) == 1) ? arr.length / 2 : arr.length / 2 + 1;
        for (int i = 0; i < arr.length; i++) {
            int step = arr.length - Math.abs(t - i);
            sum += arr[i] * step;
        }
//        arr.length
        return sum;
    }
}
