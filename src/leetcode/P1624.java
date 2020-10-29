package leetcode;

public class P1624 {
    public static void main(String[] args) {
        String s = "a";

        System.out.println(maxLengthBetweenEqualCharacters(s));

//        System.out.println(maxLengthBetweenEqualCharacters("abca"));
    }
    /* Problem
    * - 동일한 문자가 존재하는 경우
    * > 두 문자 사이에 존재하는 가장 긴 문자열의 길이를 반환
    * - 동일한 문자가 존재하지 않는 경우
    * > -1을 반환한다.
    * */

    /* Approach
    * 1. 동일한 문자가 존재하는지 검사한다.
    * 2. 동일한 문자가 있다면 시작과 끝인덱스를 구한다.
    * 3. 동일한 문자가 여러가지 존재할 수 있으니 이 중에서 index 차이가 가장 크게나는것을 선택해야한다.
    *
    * */
    public static int maxLengthBetweenEqualCharacters(String s) {
        char[] str = s.toCharArray();
        int max = -1;
        int[] check = new int[26];
        int[] minIdx = new int[26];
        int[] maxIdx = new int[26];
        for (int i = 0; i < str.length; i++) {
            int idx = str[i] - 97;
            if (0 < check[idx]) {
                maxIdx[idx] = i;
            } else {
                minIdx[idx] = i;
            }
            check[idx]++;
        }

        for (int i = 0; i < check.length; i++) {
            if (1 < check[i]) {
                int dist = maxIdx[i] - minIdx[i] - 1;
                max = Math.max(max, dist);
            }
        }
        return max;
    }
}
