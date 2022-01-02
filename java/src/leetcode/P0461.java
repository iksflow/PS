package leetcode;

public class P0461 {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(230));
        int a = 4 ^ 4;
        int b = 12;

//        System.out.println(hammingDistance(1, 4));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b-1));
        System.out.println(12 & 11);
    }


    public static int hammingDistance(int x, int y) {
        int count = 0;
        String s = Integer.toBinaryString(x ^ y) ;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
