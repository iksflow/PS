package leetcode;

public class P1394 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        System.out.println(findLucky(arr));
    }


    public static int findLucky(int[] arr) {
        int lucky = -1;
        int[] check = new int[502];
        for (int i = 0; i < arr.length; i++) {
            check[arr[i]]++;
        }
        for (int i = 1; i < check.length; i++) {
            if (i == check[i]) {
                lucky = Math.max(lucky, i);
            }
        }

        return lucky;
    }
}
