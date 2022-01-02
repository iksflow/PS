package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1441 {
    public static void main(String[] args) {
        int[] target = {1,2,3};
        int n = 3;
        System.out.println(buildArray(target, n));
    }


    public static List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < target.length;) {
            if (target[i] == count) {
                res.add("Push");
                i++;
            } else {
                res.add("Push");
                res.add("Pop");
            }
            count++;
        }

        return res;
    }
}
