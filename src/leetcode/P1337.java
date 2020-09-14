package leetcode;

import java.util.Arrays;

public class P1337 {
    public static void main(String[] args) {
//            int[][] mat =  {{1,1,0,0,0},
//                            {1,1,1,1,0},
//                             {1,0,0,0,0},
//                             {1,1,0,0,0},
//                             {1,1,1,1,1}};
        int[][] mat =   {{1,0,0,0},
                         {1,1,1,1},
                         {1,0,0,0},
                         {1,0,0,0}};
        System.out.println(Arrays.toString(kWeakestRows(mat, 2)));
    }


    public static int[] kWeakestRows(int[][] mat, int k) {
        int top = 0;
        boolean[] check = new boolean[mat.length];
        int[] res = new int[k];
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (check[j] == false && mat[j][i] == 0) {
                    res[top] = j;
                    check[j] = true;
                    top++;
                    if (top == k) {
                        return res;
                    }
                }
            }
        }


        for (int i = 0; i < mat.length; i++) {
            if (check[i] == false) {
                res[top] = i;
                top++;
                if (top == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
