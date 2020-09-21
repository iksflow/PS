package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("race car"));
        System.out.println(reverseVowels2("race car"));
    }


    public static String reverseVowels(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] str = s.toCharArray();
        int len = s.length();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (isCharVowel(str[i])) {
                list.add(i);
            }
        }
        if (list.size() < 2) {
            return s;
        }

        int size = list.size();
        int head = 0;
        int tail = size - 1;
        while (head != tail) {
            if (str[list.get(head)] == str[list.get(tail)]) {
                if (head < size - tail) {
                    head++;
                } else {
                    tail--;
                }
                continue;
            } else {
                char temp = str[list.get(head)];
                str[list.get(head)] = str[list.get(tail)];
                str[list.get(tail)] = temp;
                break;
            }
        }
        return new String(str);
    }

    public static boolean isCharVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseVowels2(String s) {
        if(s == null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){

            while(start<end && !vowels.contains(chars[start]+"")){
                start++;
            }

            while(start<end && !vowels.contains(chars[end]+"")){
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }

}
