package leetcode;

public class P1450 {

    public static void main(String[] args) {
        int[] startTime = {1, 2, 3, 4};
        int[] endTime = {5, 6, 7, 8};
        int queryTime = 3;
        System.out.println(busyStudent(startTime, endTime, queryTime));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) result++;
        }
        return result;
    }
}
