package leetcode;

/*
* 3개의 문자열 A,B,C가 주어진다고 가정한다.
* 먼저 A와 B를 비교해서 가장 긴 중복문자열을 얻어낸다.
* 그리고 다시 이 결과와 C를 비교해 가장 긴 중복문자열을 얻어낸다.
* C와 비교해 최종적으로 얻어낸 것이 모든 문자열에서 중복되는 가장 긴 문자열이 된다.*/
public class P0014 {

    public static void main(String[] args) {
        String s1 = "eeeeabc";
        String s2 = "beeeecd";
        String s3 = "bceee";
        String[] arr = {s1, s2, s3};

        System.out.println(longestCommonPrefix(arr));
//        s1.
    }

    public static String longestCommonPrefix(String[] strs) {
        return "";
    }

    public static String longestDupString(String s1, String s2) {
        String result = "";
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        for (int i = 0; i < s1Arr.length; i++) {
            boolean hit = false;
            for (int j = 0; j < s2Arr.length; j++) {
                if (s1Arr[i] == s2Arr[j]) {

                }
            }
        }

        return result;
    }
}
