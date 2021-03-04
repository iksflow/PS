package leetcode;

import java.util.*;

public class P0599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] res = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(res));
    }


    public static String[] findRestaurant(String[] list1, String[] list2) {
        // 1. 공통된 음식점 찾기
        // 2. 공통된 음식점들의 인덱스 합 구하기
        // 3. 인덱스 합 중 최소값 구하기

        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;
                    if (sum < min) {
                        min = sum;
                        res.clear();
                        res.add(list1[i]);
                    } else if (sum == min) {
                        res.add(list1[i]);
                    }
                    break;
                }

            }
        }
        return res.toArray(new String[res.size()]);
    }
}
