package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Map<String, Object>> config = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("MCLS_CD", "1");
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("MCLS_CD", "2");
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("MCLS_CD", "3");
        config.add(map1);
        config.add(map2);
        config.add(map3);

        Map<String, Object> map = config.stream()
                .map(o -> o.get("MCLS_CD").toString())
                .collect(Collectors.toMap(s -> s.toString(), o -> o.length()));
        System.out.println(map.toString());
    }
}
