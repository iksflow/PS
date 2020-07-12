package solution;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.println(solution("BZA"));
        System.out.println(getDistance('c', 'a'));
    }

    public static int solution(String s) {
        int lastValue = 65;
        int minTime = 0;
        for (char c : s.toCharArray()) {
            if (13 < Math.abs(c - lastValue)) {
                minTime += Math.abs(getDistance(c, lastValue) - 26);
            } else {
                minTime += getDistance(c, lastValue);
            }
            lastValue = c;
        }

        return minTime;
    }

    public static int getDistance(int a, int b) {
        return Math.abs(a - b);
    }

}

