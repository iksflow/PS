package leetcode;

import java.util.List;

public class P0763 {
    public static void main(String[] args) {

    }
    /*
    * start가 -1 이면 현재 인덱스를 새로운 시작인덱스로 설정한다.
    * end는 현재 인덱스의 문자를 시작문자와 같은 문자인 인덱스 중 가장 큰 값이다.
    * start가 -1이 아니라면 현재 문자의 newEnd값을 구한다.
    * 만약 newEnd값이 기존의 end값 보다 큰 경우 newEnd가 새로운 end값이 된다.
    * newEnd가 탄생하지 않고 현재인덱스가 end에 도달하면 부분문자열이다.
    * */
    public static List<Integer> partitionLabels(String s) {
        int len = s.length();
        char[] str = s.toCharArray();
        int start = -1;
        int end = -1;
        for (int i = 0; i < len; i++) {
            char startChar = '@';
            if (start == -1) {
                start = i;
                startChar = str[i];

                for (int j = i; j < len; j++) {
                    if (startChar == str[j]) {
                        end = j;
                    }
                }
            }


        }
        return null;
    }
}
