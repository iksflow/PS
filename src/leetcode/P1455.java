package leetcode;

public class P1455 {
    public static void main(String[] args) {
        String sentence = "hellohello hellohellohello";
        String searchWord = "ell";
        System.out.println(isPrefixOfWord(sentence, searchWord));

    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        int res = -1;
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (searchWord.length() <= arr[i].length()) {
                boolean equal = true;
                for (int j = 0; j < searchWord.length(); j++) {
                    if (arr[i].charAt(j) != searchWord.charAt(j)) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    res = i + 1;
                    break;
                }
            }

        }
        return res;
    }
}
