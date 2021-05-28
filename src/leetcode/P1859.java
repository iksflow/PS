package leetcode;

public class P1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
//        System.out.println(s.substring(0, 2));
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] result = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            int idx = strArr[i].charAt(len - 1);
            result[idx] = strArr[i].substring(0, len - 1);
        }
        System.out.println(result.toString());
        return "";
    }
}
