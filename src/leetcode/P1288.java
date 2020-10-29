package leetcode;

public class P1288 {
    public static void main(String[] args) {
        int[][] intervals = {{3,10},{4,10},{5,11}};
        System.out.println(removeCoveredIntervals(intervals));
    }

    public static int removeCoveredIntervals(int[][] intervals) {
//        boolean[] check = new boolean[intervals.length];
        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            for (int j = 0; j < intervals.length; j++) {
                if (i != j) {
                    int[] otherInterval = intervals[j];
                    if (interval[0] >= otherInterval[0] && interval[1] <= otherInterval[1]) {
                        max++;
                        break;
                    }
                }
            }

        }

        return intervals.length - max;
    }
}
