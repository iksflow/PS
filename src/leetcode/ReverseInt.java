package leetcode;

import java.util.function.DoubleToIntFunction;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(solution(-2147483648));
    }
    public static int solution(int x) {
        StringBuilder s = new StringBuilder();
        String result = "";
        if (x < 0) {
            s.append(String.valueOf(x).replaceAll("-", ""))
            .append("-");
        } else {
            s.append(x);
        }
        result = s.reverse().toString();
        if (Integer.MIN_VALUE <= Long.parseLong(result) && Long.parseLong(result) <= Integer.MAX_VALUE) {
            return Integer.valueOf(result);
        } else {
            return 0;
        }
    }
}

