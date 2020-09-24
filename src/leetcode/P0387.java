package leetcode;

public class P0387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }


    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < count.length; j++) {
                if (count[j] == 1) {
                    if (c == (char)j + 97) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}
