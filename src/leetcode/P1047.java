package leetcode;

public class P1047 {
    public static void main(String[] args) {
        String s = "abbaca";
//        "aaaaaaaaa"
        System.out.println(removeDuplicates(s));
        System.out.println(removeDuplicates2(s));
    }


    public static String removeDuplicates(String S) {

        char[] str = S.toCharArray();

        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] == str[i + 1]) {
                str[i] = ' ';
                str[i + 1] = ' ';
                break;
            }
        }
        String res = new String(str);
        res = res.replaceAll(" ", "");
        if (res.equals(S)) {
            return res;
        } else {
            return removeDuplicates(res);
        }
    }


    public static String removeDuplicates2(String S) {

        char[] stack = new char[S.length()];
        int index = -1;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (index == -1 || stack[index] != c) {
                stack[++index] = c;
            }
            else {
                index--;
            }
        }

        return new String(stack, 0, index + 1);
    }
}
