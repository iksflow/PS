package leetcode;

public class P1374 {
    public static void main(String[] args) {
        System.out.println(generateTheString(6));
    }
    public static String generateTheString(int n) {
        char[] str = new char[n];
        for (int i = 0; i < n; i++) {
            str[i] = 'a';
        }
        if ((n & 1) == 0) {
            str[0] = 'b';
        }

        return new String(str);
    }
}
