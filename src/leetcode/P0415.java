package leetcode;

public class P0415 {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "9";

        System.out.println(addStrings(s1, s2));
    }


    public static String addStrings(String num1, String num2) {
        if (num1.length() == 0) {
            return num2;
        }
        if (num2.length() == 0) {
            return num1;
        }
        int index = 0;
        int remain = 0;
        int len1 = num1.length();
        int len2 = num2.length();
        StringBuilder sb = new StringBuilder();

        while (index < len1 || index < len2 || remain != 0) {
            int n1 = (0 <= len1 - index -1) ? num1.charAt(len1 - index - 1) - '0' : 0;
            int n2 = (0 <= len2 - index -1) ? num2.charAt(len2 - index - 1) - '0' : 0;
            sb.append((n1 + n2 + remain) % 10);
            remain = (n1 + n2 + remain) / 10;
            index++;
        }
        return sb.reverse().toString();
    }
}
