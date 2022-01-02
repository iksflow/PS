package leetcode.dailychallenge.year2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AddAndSearchWord {
    public static void main(String[] args) {
        String s = "abcde";


    }
    public static class WordDictionary {
        int index = 0;
        String[] wordArr = new String[10001];
        /** Initialize your data structure here. */
        public WordDictionary() {

        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            wordArr[index] = word;
            if (wordArr.length <= index) {
                wordArr = Arrays.copyOf(wordArr, 10000);
            }
            index++;
        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {

            for (int i = 0; i < wordArr.length; i++) {
                if (wordArr[i] != null) {
                    if (wordArr[i].matches(word)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
//    public static class WordDictionary {
//        int index = 0;
//        String[] wordArr = new String[10001];
//        /** Initialize your data structure here. */
//        public WordDictionary() {
//
//        }
//
//        /** Adds a word into the data structure. */
//        public void addWord(String word) {
//            wordArr[index] = word;
//            if (wordArr.length <= index) {
//                wordArr = Arrays.copyOf(wordArr, 10000);
//            }
//            index++;
//        }
//
//        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
//        public boolean search(String word) {
//
//            for (int i = 0; i < wordArr.length; i++) {
//                if (wordArr[i] != null) {
//                    if (wordArr[i].matches(word)) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
//    }

}
