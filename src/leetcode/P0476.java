package leetcode;


public class P0476 {
    public static void main(String[] args) {
        System.out.println(findComplement(2));


    }

    public static int findComplement(int num) {
        long res = 0;
        long max = 1;
        while(max <= num) {
            max *= 2;
        }
        res = max -1 -num;
        return (int)res;
    }
}
