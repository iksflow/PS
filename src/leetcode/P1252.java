package leetcode;

public class P1252 {
    public static void main(String[] args) {
        System.out.println((3 & 1)  == 1);
    }

    public int oddCells(int n, int m, int[][] indices) {
        int[][] result = new int[n][m];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < m; j++) {
                result[indices[i][0]][j]++;
            }
            for (int j = 0; j < n; j++) {
                result[j][indices[i][0]]++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((result[i][j] & 1) == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
