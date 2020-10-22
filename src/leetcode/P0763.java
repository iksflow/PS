package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0763 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
    /*
    * start가 -1 이면 현재 인덱스를 새로운 시작인덱스로 설정한다.
    * end는 현재 인덱스의 문자를 시작문자와 같은 문자인 인덱스 중 가장 큰 값이다.
    * start가 -1이 아니라면 현재 문자의 newEnd값을 구한다.
    * 만약 newEnd값이 기존의 end값 보다 큰 경우 newEnd가 새로운 end값이 된다.
    * newEnd가 탄생하지 않고 현재인덱스가 end에 도달하면 부분문자열이다.
    * */
    public static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int len = s.length();
        char[] str = s.toCharArray();
        int start = -1;
        int end = -1;
        int newEnd = -1;
        char currentChar = ' ';
        for (int i = 0; i < len; i++) {
            if (i == end) {
                res.add(end - start + 1);
                start = -1;
                continue;

            }
            if (start == -1) {
                start = i;
            }
            currentChar = str[i];
            for (int j = i; j < len; j++) {
                if (currentChar == str[j]) {
                    newEnd = j;
                }
            }
            end = Math.max(end, newEnd);

            if (start == end) {
                res.add(1);
            }


        }
        return res;
    }
}
