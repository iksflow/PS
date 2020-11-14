package leetcode;

import java.util.HashMap;

public class P0205 {
    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        System.out.println(isIsomorphic(s, t));

    }
    /* A: egg
    *  B: add
    *  1. A의 알파벳 인덱스 자리의 값이 0인 경우 B의 문자값을 넣는다.
    *  2. A의 알파벳 인덱스 자리의 값이 0이 아닌경우 인덱스 자리의 값과 현재 문자값을 비교한다.
    *  3. 값이 같은 경우 다음 검사를 진행, 다르다면 false를 반환한다.
    *  위 로직으로는 문자값을 다 처음넣는경우 판단을 못한다.
    *  그래서 크로스체크해야함.*/
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> crossMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 0;
            int value = t.charAt(i) - 0;
            if (map.get(idx) == null) {
                map.put(idx, value);
            } else {
                if (map.get(idx) != value) {
                    return false;
                }
            }
            // cross check
            if (crossMap.get(value) == null) {
                crossMap.put(value, idx);
            } else {
                if (crossMap.get(value) != idx) {
                    return false;
                }
            }

        }

        return true;
    }
}
