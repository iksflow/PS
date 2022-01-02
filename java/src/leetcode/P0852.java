package leetcode;

public class P0852 {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else {
                if (1 < i) {
                    return i - 1;
                }
            }
        }

        return arr.length - 2;
    }
}
