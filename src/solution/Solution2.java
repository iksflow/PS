package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
//        int [][] arr = [[0,2], [2,3], [2,1]];
        System.out.println();
    }

    public static List<Integer> solution(List<List<Integer>> arr) {
        List<Integer> result = new ArrayList<>();
        List<BinaryArray> binList = new ArrayList<>();
        int count = 0;
        for (List<Integer> list : arr) {
            int sum = 0;
            for (Integer num : list) {
                sum += Math.pow(2, num);
            }
            binList.add(new BinaryArray(count, sum));
            count++;
        }
        for (BinaryArray bin : binList) {
            result.add(bin.getNo());
        }


        return result;
    }

    private static class BinaryArray {
        private int no;
        private int value;

        public BinaryArray(int no, int value) {
            this.no = no;
            this.value = value;
        }

        public int getNo() {
            return no;
        }
    }
}
