package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class P0811 {
    public static void main(String[] args) {
        String[] arr = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(arr));
    }


    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] domainInfo = domain.split(" ");
            int times = Integer.parseInt(domainInfo[0]);
            String domainName = domainInfo[1];
            String[] subDomains = domainInfo[1].split("\\.");
            String fullName = "";
            for (int i = subDomains.length - 1; 0 <= i; i--) {
                if (i == subDomains.length - 1) {
                    fullName = subDomains[i];
                } else {
                    fullName = subDomains[i] + "." + fullName;
                }
                map.put(fullName, map.getOrDefault(fullName, 0) + times);

            }
        }
        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String domain = iter.next();
            String result = map.get(domain) + " " + domain;
            res.add(result);
        }

        return res;
    }
}
