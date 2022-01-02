package leetcode;

/* [Easy]XOR Operation in an Array */
public class P1486 {
    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }
    public static int xorOperation(int n, int start) {
//        int[] nums = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= start + 2*i;
        }
        return result;
    }
}
