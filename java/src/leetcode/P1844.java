package leetcode;

public class P1844 {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
        char a = 'a';
        char b = '1';
        char c = 'a' - '1';
        System.out.println(a + 0);
        System.out.println(b + 0);
    }

    public static String replaceDigits(String s) {
        char[] strArr = s.toCharArray();

        for (int i = 0; i < strArr.length; i = i + 2) {
            if (i == strArr.length - 1) {
                break;
            } else {

                int step = strArr[i + 1] - 48;
                char c = (char)(strArr[i] + step);
                strArr[i + 1] = c;
            }
        }

        return new String(strArr);
    }
}
