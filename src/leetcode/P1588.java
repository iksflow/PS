package leetcode;

public class P1588 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    // [1, 4, 2, 5, 3]
    // [1, 2]
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int t = ((arr.length & 1) == 1) ? arr.length / 2 : arr.length / 2 + 1;
        for (int i = 0; i < arr.length; i++) {
            int step = arr.length - Math.abs(t - i);
            sum += arr[i] * step;
            System.out.println("current sum: " + arr[i] * step);
        }
        return sum;
    }
}
