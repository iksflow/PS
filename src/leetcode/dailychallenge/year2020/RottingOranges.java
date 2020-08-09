package leetcode.dailychallenge.year2020;

// hold
public class RottingOranges {
    public static void main(String[] args) {
        int[][] input = {{2,1,1},{1,1,0},{0,1,1}};
        orangesRotting(input);
    }
    public static int orangesRotting(int[][] grid) {
        int minute = 0;
        for (int i = 0; i < grid.length; i++) {
            minute++;
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 2) {
                    if (0 < j) {
                        if (grid[i][j-1] == 1) {
                            grid[i][j-1] = 3;   // left
                        }

                    }
                    if (j < grid[i].length - 1) {
                        if (grid[i][j+1] == 1) {
                            grid[i][j+1] = 3;   // right
                        }

                    }
                    if (0 < i) {
                        if (grid[i-1][j] == 1) {
                            grid[i-1][j] = 3;   // up
                        }

                    }
                    if (i < grid.length - 1) {
                        if (grid[i+1][j] == 1) {
                            grid[i+1][j] = 3;   // down
                        }

                    }

                }
            }
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 3) {
                    grid[i][j] = 2;
                }
            }

        }

        return minute;
    }
}
