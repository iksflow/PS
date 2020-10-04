package leetcode;

public class P0504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(7));
    }


    public static String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int div = 7;
        if (num < 0){
            num *= -1;
        }
        while (div < num) {
            div *= 7;
        }
        div /= 7;
        while (0 < num) {
            sb.append(num/div);
            num = num % div;
            div /= 7;
        }


        return sb.toString();
    }
}
