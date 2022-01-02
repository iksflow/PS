package leetcode;

public class P1812 {
    public static void main(String[] args) {
        String coordinates = "h3";
        System.out.println(squareIsWhite(coordinates));
    }

    public static boolean squareIsWhite(String coordinates) {
        char[] arr = coordinates.toCharArray();
        int c1 = arr[0] - 'a';
        int c2 = arr[1] - '1';
        return ((c1 + c2) & 1) == 1;
    }
}
