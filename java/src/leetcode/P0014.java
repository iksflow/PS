package leetcode;

/*
* 3개의 문자열 A,B,C가 주어진다고 가정한다.
* 먼저 A와 B를 비교해서 가장 긴 중복문자열을 얻어낸다.
* 그리고 다시 이 결과와 C를 비교해 가장 긴 중복문자열을 얻어낸다.
* C와 비교해 최종적으로 얻어낸 것이 모든 문자열에서 중복되는 가장 긴 문자열이 된다.*/
public class P0014 {

    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "a";
        String[] arr = {s1, s2};

        System.out.println(longestCommonPrefix(arr));
//        s1.
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return "";
        }
        char[] compareArr = strs[0].toCharArray();
        for (int i = 0; i < compareArr.length; i++) {
            boolean hit = true;
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || compareArr[i] != strs[j].charAt(i)) {
                    hit = false;
                    break;
                }
            }
            if (hit) {
                result += compareArr[i];
            } else {
                break;
            }
        }
        return result;
    }

}
