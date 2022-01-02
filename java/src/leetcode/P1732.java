package leetcode;

public class P1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int result = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            result = Math.max(current, result);
        }
        return result;
    }
}
