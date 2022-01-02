package leetcode;

public class P0383 {
    public static void main(String[] args) {
        System.out.println('a' - 'a');
        System.out.println(canConstruct("aa", "aab"));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] words = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            words[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (words[c - 'a'] == 0) {
                return false;
            } else {
                words[c - 'a']--;
            }
        }
        return true;
    }
}
