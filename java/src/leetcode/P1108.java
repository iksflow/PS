package leetcode;
/* Defanging an IP Address */
public class P1108 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        String result = address.replaceAll("\\.", "[.]");
        return result;
    }
}
