package leetcode;


/*
RomanToInteger
*/

public class P0013 {
    public static void main(String[] args) {
        System.out.println(romanToInt("XI"));
    }

    public static int romanToInt(String s) {
        char prevChar = '?';
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c == 'I') {
                sum += 1;
            }
            if (c == 'V') {
                if (prevChar == 'I') {
                    sum += 3;
                } else {
                    sum += 5;
                }
            }
            if (c == 'X') {
                if (prevChar == 'I') {
                    sum += 8;
                } else {
                    sum += 10;
                }
            }
            if (c == 'L') {
                if (prevChar == 'X') {
                    sum += 30;
                } else {
                    sum += 50;
                }
            }
            if (c == 'C') {
                if (prevChar == 'X') {
                    sum += 80;
                } else {
                    sum += 100;
                }
            }
            if (c == 'D') {
                if (prevChar == 'C') {
                    sum += 300;
                } else {
                    sum += 500;
                }
            }
            if (c == 'M') {
                if (prevChar == 'C') {
                    sum += 800;
                } else {
                    sum += 1000;
                }
            }
            prevChar = c;

        }

        return sum;
    }

}
