package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1380 {
    public static void main(String[] args) {
//       int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix).toString());
    }


    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int[] min = new int[matrix.length];
        int minValue = 100001;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    min[i] = j;
                }
            }
            minValue = 100001;
        }
        for (int i = 0; i < min.length; i++) {
            int ori = matrix[i][min[i]];
            boolean isLucky = true;
            for (int j = 0; j < matrix.length; j++) {
                if (ori < matrix[j][min[i]]) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                res.add(ori);
            }
        }

        return res;
    }
}
