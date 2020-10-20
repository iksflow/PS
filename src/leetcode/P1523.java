package leetcode;

public class P1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(1, 4));
    }


    public static int countOdds(int low, int high) {
        /*
        * 홀수, 홀수
        * e.g) 1, 5 = [1,3,5] = 3 = (5 - 1) / 2 + 1
        * e.g) 1, 7 = [1,3,5,7] = 4 = (7 - 1) /2 + 1
        * 홀수, 짝수
        * 1, 4 = [1, 3] = 2 = (4 - 1) / 2 + 1
        * 3, 8 = [3, 5, 7] = 3 = (8 - 3) / 2 + 1
        * 짝수, 짝수
        * 4, 8 = [5, 7] = 2 = (8 - 4) / 2
        * */
        int add = 1;
        if ((low & 1) == 0 && (high & 1) == 0) {
             add = 0;
        }
        return (high - low) / 2 + add;
    }
}
