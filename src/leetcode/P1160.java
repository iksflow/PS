package leetcode;

public class P1160 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }


    public static int countCharacters(String[] words, String chars) {
        int res = 0;

        for (int i = 0; i < words.length; i++) {
            boolean isGoodStr = true;
            int[] check = new int [26];

            for (int j = 0; j < words[i].length(); j++) {
                check[words[i].charAt(j) - 97]++;
            }

            for (int j = 0; j < chars.length(); j++) {
                check[chars.charAt(j) - 97]--;
            }

            for (int j = 0; j < check.length; j++) {
                if (0 < check[j]) {
                    isGoodStr = false;
                    break;
                }
            }

            if (isGoodStr) {
                res += words[i].length();
            }
        }
        return res;
    }


}
