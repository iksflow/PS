package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0929 {
    public static void main(String[] args) {
        String[] emails =  {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }


    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String[] cmpst = email.split("@");
            String local = cmpst[0];
            String domain = cmpst[1];
            // filter

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < local.length(); j++) {
                char c = local.charAt(j);
                if (c == '+') {
                    break;
                } else if (c == '.') {
                    continue;
                } else {
                    sb.append(c);
                }
            }
            String filteredEmail = sb.append('@' + domain).toString();

            if (!set.contains(filteredEmail)) {
                set.add(filteredEmail);
            }
        }

        return set.size();
    }
}
