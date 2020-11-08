package leetcode;

public class P1507 {
    public static void main(String[] args) {

    }

    public static String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] arr = date.split(" ");
        String[] monthSet = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String month = "";

        for (int i = 0; i < monthSet.length; i++) {
            if (arr[1].equals(monthSet[i])) {
                month = String.format("%02d", i + 1);
                break;
            }
        }
        sb.append(arr[2]).append("-").append(month).append("-").append(String.format("%02d", Integer.parseInt(arr[0].replaceAll("[a-z]", ""))));

        return sb.toString();
    }
}
