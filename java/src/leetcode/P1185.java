package leetcode;

import java.time.LocalDate;

public class P1185 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        LocalDate date = LocalDate.of(2020, 11, 01);
        int idx = date.getDayOfWeek().getValue() % 7;
        System.out.println(days[idx]);
    }
}
