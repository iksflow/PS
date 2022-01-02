package leetcode;

public class P1640 {
    public static void main(String[] args) {
        int[] arr = {49,18,16};
        int[][] pieces = {{16,18,49}};
        System.out.println(canFormArray(arr, pieces));
    }

    /*
    * 1. pieces의 2차배열을 전부 풀어서 1차로 만든다.
    * 2. arr과 비교해서 동일한 순서로 값들이 인덱싱 되어있다면 true, 아니면 false*/

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i].length == 1) {
                boolean hit = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == pieces[i][0]) {
                        hit = true;
                    }
                }
                if (hit == false) {
                    return false;
                }

            } else {
                boolean hit = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == pieces[i][0]) {
                        hit = true;
                        for (int k = 1; k < pieces[i].length; k++) {
                            if (arr.length <= j + k) {
                                return false;
                            }
                            if (arr[j + k] != pieces[i][k]) {
                                return false;
                            }
                        }
                    }
                }
                if (hit == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
