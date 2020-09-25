package leetcode;

public class P0405 {
    public static void main(String[] args) {
        int a = -1;
//        System.out.println("My Logic: " + toHex(-1));
//        System.out.println("Integer.toHexString: " + Integer.toHexString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(-1));
//        System.out.println(Integer.toBinaryString(9));
        System.out.println(toHex(-1));
    }

    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += Math.pow(2, i) * (num & 1);
                num >>>= 1;
            }
            sb.append(hex[sum]);
        }
        return sb.reverse().toString();
    }
}
