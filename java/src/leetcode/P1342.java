package leetcode;

public class P1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(4));
    }
    public static int numberOfSteps (int num) {
        int step = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            step++;
        }
        return step;
    }
}
