package leetcode;

import java.util.HashMap;
import java.util.List;

public class P1773 {
    public static void main(String[] args) {

        
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);

        int index = map.get(ruleKey);
        int result = 0;
        for(List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                result++;
            }
        }
        return result;
    }
}
