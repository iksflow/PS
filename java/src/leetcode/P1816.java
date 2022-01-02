package leetcode;

public class P1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        if (arr.length == k) {
            return s;
        }

        for (int i = 0; i < k; i++) {
            sb.append(arr[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
