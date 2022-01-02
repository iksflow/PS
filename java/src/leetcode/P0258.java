package leetcode;

public class P0258 {
    public static void main(String[] args) {
        System.out.println(addDigits(12345));
    }

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int temp = 0;
        while(9 < num) {
            temp += num%10;
            num /= 10;
        }
        temp += num;

        return addDigits(temp);
    }
}
