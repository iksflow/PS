package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1002 {
    public static void main(String[] args) {
        String[] str = {"cool","lock","cook"};
        String s1 = "bella";
        String s2 = "ale";
        System.out.println(commonChars(str));
    }


    public static List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        if (A.length == 1) {
            return res;
        }
        String head = A[0];
        String temp = A[1];
        String common = sameChars(head, temp);
        for (int i = 2; i < A.length; i++) {
            String target = A[i];
            String same = sameChars(common, target);
            if (common.length() > same.length()) {
                common = same;
            }

        }
        for (char c : common.toCharArray()) {
            res.add("" + c);
        }
        return res;
    }

    public static String sameChars(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int nextIdx = 0;
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            for (int j = nextIdx; j < c2.length; j++) {
                if (c1[i] == c2[j]) {
                    sb.append(c1[i]);
                    nextIdx = j + 1;
                    break;
                }
            }
        }

        return sb.toString();
    }

}
