package leetcode;

public class P0168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));

    }


    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (0 < n) {
            n /= 26;
            count++;
        }
        System.out.println(count);
        return sb.toString();
    }
}
