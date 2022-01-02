package leetcode;

public class P1009 {
    public static void main(String[] args) {
        /*1010
        *^1111
        * 0101*/
        int N = 0;
        System.out.println(bitwiseComplement(N));

    }

    public static int bitwiseComplement(int N) {
        int max = 1;
        while (max <= N) {
            max <<= 1;
        }

        return (max - 1) ^ N;
    }
}
