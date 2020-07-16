package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder().append(x);
        String org = sb.toString();
        String rev = sb.reverse().toString();

        return org.equals(rev);
    }

}
