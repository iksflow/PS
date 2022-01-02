package leetcode;

public class P1678 {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }

    public static String interpret(String command) {
        String result = command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
        return result;
//
    }
}
