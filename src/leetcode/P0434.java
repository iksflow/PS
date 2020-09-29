package leetcode;

public class P0434 {
    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";

        System.out.println(countSegments(s));
    }

    public static int countSegments(String s) {

        if (s.length() == 0) {
            return 0;
        }

        String[] str = s.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                count++;
            }
        }

        return count;
    }
}
