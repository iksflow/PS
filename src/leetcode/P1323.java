package leetcode;

public class P1323 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9969));
    }

    public static int maximum69Number (int num) {
        int result = 0;
        if (num % 10000 / 1000 == 6) {
            result = num + 3000;
        } else if (num % 1000 / 100 == 6) {
            result = num + 300;
        } else if (num % 100 / 10 == 6) {
            result = num + 30;
        } else if (num % 10 == 6) {
            result = num + 3;
        } else {
            result = num;
        }

        return result;
    }
}
