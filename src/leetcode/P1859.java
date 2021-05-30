package leetcode;

public class P1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(s.substring(0, 2));
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] result = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            int idx = strArr[i].charAt(len - 1) - '0' - 1;
            result[idx] = strArr[i].substring(0, len - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i] + " ");
        }


        return sb.toString();
    }
}
