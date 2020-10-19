package leetcode;

import sun.misc.PostVMInitHook;

public class P1496 {
    public static void main(String[] args) {
        System.out.println(isPathCrossing("N"));
    }

    public static boolean isPathCrossing(String path) {
        boolean res = false;
        char[] str = path.toCharArray();
        int[][] points = new int[str.length][str.length];
        int x = 0;
        int y = 0;
        int xMin = 0;
        int yMin = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'N') {
                y++;
            } else if (str[i] == 'S') {
                y--;
            } else if (str[i] == 'E') {
                x++;
            } else {
                x--;
            }
            xMin = Math.min(xMin, x);
            yMin = Math.min(yMin, y);

        }
        return res;
    }
}
