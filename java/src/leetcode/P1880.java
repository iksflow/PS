package leetcode;

public class P1880 {
    public static void main(String[] args) {
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord = "aaaa";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        return getIntegerValue(firstWord) + getIntegerValue(secondWord) == getIntegerValue(targetWord);
    }

    public static int getIntegerValue(String s) {
        char[] arr = s.toCharArray();
        int cnt = 1;
        int result = 0;
        for (int i = arr.length - 1; 0 <= i; i--) {
            int numeric = arr[i] - 'a';
            result += numeric * cnt;
            cnt *= 10;
        }
        return result;
    }
}
