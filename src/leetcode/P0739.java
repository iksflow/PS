package leetcode;

import leetcode.util.PrintUtil;

import java.util.Arrays;

public class P0739 {
    public static void main(String[] args) {
        int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
        PrintUtil.arrayPrinter(t);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            t = Arrays.copyOf(t, t.length * 2);
        }
        System.out.println(t.length);
        System.out.println("1번 로직: " + dailyTemperatures(t));
        System.out.println("2번 로직: " + dailyTemperatures2(t));
    }

    // brute force
    public static int dailyTemperatures(int[] T) {
        int count = 0;
        int[] result = new int[T.length];
        for (int i = 0; i < T.length-1; i++) {
            for (int j = i + 1; j < T.length; j++) {
//                System.out.println("j : " + j + " : " + T[j]);
                count++;
                if (T[i] < T[j]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return count;
    }

    public static int dailyTemperatures2(int[] T) {
        int count = 0;
        int whileCount = 0;
        int[] stack = new int[T.length];
        int top = -1;
        int[] res = new int[T.length];
        for(int i=0;i<T.length;i++) {
            while(top > -1 && (T[stack[top]] < T[i])) {
//                System.out.println("i : " + i + " : " + T[i]);
                whileCount++;
                int idx = stack[top--];
                res[idx] = i-idx;
            }
            count++;
            stack[++top] = i;
        }
        return count + whileCount;
    }
}
