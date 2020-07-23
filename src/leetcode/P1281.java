package leetcode;

/* [Easy]Subtract the Product and Sum of Digits of an Integer */
public class P1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;

        while(n != 0) {
            sum += n%10;
            prod *= n%10;
            n /= 10;
        }
        return Math.abs(prod - sum);
    }
}
