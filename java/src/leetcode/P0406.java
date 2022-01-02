package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P0406 {
    public static void main(String[] args) {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] result = reconstructQueue(people);
//        System.out.println(Arrays.toString(people));
        for(int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }


    public static int[][] reconstructQueue(int[][] people) {
        int[][] res = new int[people.length][2];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return -1;
                } else if(o1[0] == o2[0] && o1[1] < o2[1]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {

            result.add(people[i][1], people[i]);
        }

        return result.toArray(res);
    }
}
