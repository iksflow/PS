package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P1436 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        l1.add("B");
        l1.add("C");
        List<String> l2 = new ArrayList<>();
        l2.add("D");
        l2.add("B");
        List<String> l3 = new ArrayList<>();
        l3.add("C");
        l3.add("A");

        list.add(l1);
        list.add(l2);
        list.add(l3);

        System.out.println(destCity(list));
    }

    public static String destCity(List<List<String>> paths) {
        String result = "";
        List<String> depart = new ArrayList<>();
        List<String> dest = new ArrayList<>();

        for (List<String> path : paths) {
            depart.add(path.get(0));
            dest.add(path.get(1));
        }
        for (String destination : dest) {
            if (!depart.contains(destination)) {
                result = destination;
                break;
            }
        }
        return result;
    }

}
