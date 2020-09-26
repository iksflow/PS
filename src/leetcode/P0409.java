package leetcode;

public class P0409 {
    public static void main(String[] args) {
        // 65, 97
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));
        /*
        *
        * 짝수 + 홀수 +
        * aa / bbb = babab , abbba
        * 홀수 + 홀수
        * aaa / bbb = 안됨
        * 홀수 + 홀수 + 홀수 = 안됨
        * 홀수 + 홀수 + 짝수 = 안됨
        *
        * */

    }


    public static int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int maxLen = 0;
        int maxOdd = 0;
        char[] str = s.toCharArray();
        int[] alphabet = new int[52];
        for (int i = 0; i < str.length; i++) {
            if (str[i] + 0 < 97) {
                alphabet[str[i] - 39]++;
            } else {
                alphabet[str[i] - 'a']++;
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            if ((alphabet[i] & 1) == 0) {
                maxLen += alphabet[i];
            } else {
                maxLen += alphabet[i] - 1;
                maxOdd = Math.max(alphabet[i], maxOdd);
            }
        }
        return (maxOdd == 0) ? maxLen : maxLen + 1;
    }
}
