package leetcode;

public class P1629 {
    public static void main(String[] args) {

    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] check = new int[26];
        for (int i = 0; i < releaseTimes.length; i++) {
            int idx = keysPressed.charAt(i) - 97;
            if (i == 0) {
                check[idx] = releaseTimes[i];
            } else {
                check[idx] = Math.max(check[idx], releaseTimes[i] - releaseTimes[i - 1]);
            }
        }

        return ' ';
    }
}
