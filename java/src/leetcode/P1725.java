package leetcode;

public class P1725 {
    public static void main(String[] args) {
        int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
        System.out.println(countGoodRectangles(rectangles));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int[] rectangle = rectangles[i];
            int width = Math.min(rectangle[0], rectangle[1]);
            if (width == max) {
                result ++;
            } else if (max < width) {
                max = width;
                result = 1;
            }
        }

        return result;
    }
}
