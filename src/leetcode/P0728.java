package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0728 {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(66, 708));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (; left <= right; left++) {
            if (left < 10) {
                res.add(left);
            } else if (left < 100) {
                if (left % 10 == 0) {
                    continue;
                }
                if (left % (left/10) == 0 && left % (left % 10) == 0) {
                    res.add(left);
                }
            } else if (left < 1000) {
                if (left % 10 == 0 || ((left/10) % 10) == 0) {
                    continue;
                }
                if (left % (left/100) == 0
                        && left % ((left/10) % 10) == 0
                        && left % (left % 10) == 0) {
                    res.add(left);
                }
            } else if (left < 10000){
                if (left % 10 == 0 || ((left/10) % 10) == 0 || ((left/100)%10) == 0) {
                    continue;
                }
                if (left % (left/1000) == 0
                        && left % ((left/100)%10) == 0
                        && left % ((left/10) % 10) == 0
                        && left % (left % 10) == 0) {
                    res.add(left);
                }
            }

        }
        return res;
    }
}
