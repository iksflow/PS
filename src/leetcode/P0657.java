package leetcode;

public class P0657 {
    public static void main(String[] args) {

    }


    public static boolean judgeCircle(String moves) {
        int[] point = {0, 0};

        for(int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                point[0]++;
            } else if (moves.charAt(i) == 'L') {
                point[0]--;
            } else if (moves.charAt(i) == 'U') {
                point[1]++;
            } else if (moves.charAt(i) == 'D') {
                point[1]--;
            }
        }

        return (point[0] == 0 && point[1] == 0);

    }
}
