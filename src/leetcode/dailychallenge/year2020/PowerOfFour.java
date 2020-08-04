package leetcode.dailychallenge.year2020;

public class PowerOfFour {
    public static void main(String[] args) {
        int a = 1162261466;
        System.out.println(4<<2);
        System.out.println(isPowerOfFour(1));
        System.out.println(16 & 15);
        System.out.println(0x55555555);




    }

    public static boolean isPowerOfFour(int num) {
        if (num < 1) {
            return false;
        }
        if (num == 1) {
            return true;
        }

        String bin = Integer.toBinaryString(num);
        String pow = 1 + String.format("%0" + (bin.length() - 1) + "d", 0);


        if ((bin.length() & 1) == 1 && bin.equals(pow)) {
            return true;
        } else {
            return false;
        }
    }

}
