package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
//        char c = 122;
//        System.out.println(c);
        String s = "ابت";
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
        System.out.println(s.replaceAll("^[^x00-x7F]+$", ""));
    }

    public static boolean isPalindrome(String s) {
        String raw = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(raw);
        int index = ((raw.length() & 1) == 1) ? raw.length()/2 + 1 : raw.length()/2;
        if (raw.equals("") == false) {
            for (int i = 0; i < index; i++) {
                if (raw.charAt(0 + i) != raw.charAt(raw.length() - i -1)) {
                    return false;
                }
            }
        }


        return true;
    }
}
