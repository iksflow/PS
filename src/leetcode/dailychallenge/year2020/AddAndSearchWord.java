package leetcode.dailychallenge.year2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AddAndSearchWord {
    public static void main(String[] args) {
        WordDictionary dic = new WordDictionary();
        List<String> list = new ArrayList<>();

        System.out.println("추가 시작");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 400000; i++) {
            dic.addWord("" + i);
        }
        System.out.println("추가 끝");
        long end = System.currentTimeMillis();
        System.out.println(end - start);


        System.out.println("검색 시작");
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            dic.search("" + i);
        }
        System.out.println("검색 끝");
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
    public static class WordDictionary {
        int index = 0;
        boolean isSorted = true;
        String[] wordArr = new String[400011];
        /** Initialize your data structure here. */
        public WordDictionary() {

        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            wordArr[index] = word;
            index++;
        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            char[] c = word.toCharArray();
            // word의 .인덱스 자리를 체크해서 루프돌때 wordArr[i]의 인덱스위치값을 .으로 똑같이 치환한다음 비교해서 같은문자인지 판별하기
//            word.charAt()
            for (int i = 0; i < wordArr.length; i++) {
                if (wordArr[i] != null) {
//                    char[] charArr = wordArr[i].toCharArray();

//                    for (int j = 0; j < wordLen; j++) {
//
//                    }
                }

            }
//                    if (word.charAt(0) != '.' && word.charAt(0) < dic.get(i).charAt(0)) {
//                        break;
//                    }
//
//                    int count = 0;
//                    for (int j = 0; j < word.length(); j++) {
//                        if (word.charAt(j) == '.' || word.charAt(j) == dic.get(i).charAt(j)) {
//                            count++;
//                        } else {
//                            break;
//                        }
//                    }
//
//                    if (count == word.length()) {
//                        return true;
//                    }
//                }

            return false;
        }
    }

}
