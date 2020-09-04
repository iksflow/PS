package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P1370 {
    public static void main(String[] args) {

        String s = "leetcode";
        String result = sortString(s);
        System.out.println(result);
    }

    static StringBuilder sb = new StringBuilder();
    public static String sortString(String s) {
        if (s.length() < 2) {
            return s;
        }

        asc(s);
        return sb.toString();

    }

    public static void asc(String s) {
        if (s.length() < 2) {
            sb.append(s);
            return;
        }
        StringBuilder temp = new StringBuilder();
        char[] str = s.toCharArray();
        Arrays.sort(str);

        temp.append(str[0]);
        str[0] = ' ';
        for (int i = 1; i < str.length; i++) {
            if (str[i] > temp.charAt(temp.length() - 1)) {
                temp.append(str[i]);
                str[i] = ' ';
            }
        }
        sb.append(temp);
        desc(new String(str).replaceAll(" ", ""));
    }

    public static void desc(String s) {
        if (s.length() < 2) {
            sb.append(s);
            return;
        }
        StringBuilder temp = new StringBuilder();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        temp.append(str[str.length - 1]);
        str[str.length - 1] = ' ';
        for (int i = str.length - 2; 0 <= i; i--) {
            if (str[i] < temp.charAt(temp.length() - 1)) {
                temp.append(str[i]);
                str[i] = ' ';
            }
        }

        sb.append(temp);
        asc(new String(str).replaceAll(" ", ""));
    }
}
