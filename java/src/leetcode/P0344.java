package leetcode;

public class P0344 {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
//        char[] s = {'H', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        char temp = ' ';
        for (int i = 0; i < s.length/2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
