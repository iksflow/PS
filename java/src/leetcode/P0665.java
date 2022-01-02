package leetcode;

public class P0665 {
    public static void main(String[] args) {
        int[][] testCases = {
            {4, 2, 3},      // true
            {4, 2, 1},      // false
            {1, 2, 3, 1},   // true
            {4, 2, 6},      // true
            {3, 4, 2, 3},   // false
            {1, 2, 3},      // true
            {5, 7, 1, 8},   // true
            {-1, 4, 2, 3}   // true
        };
        for (int[] testCase : testCases) {
            System.out.println(checkPossibility(testCase));
        }

    }

    /*check[i] 는 nums[i] 가 오름차순정렬원소가 맞는지 확인 맞으면 true 아니면 false
    * nums[i] < nums[i+1] 인 경우 check[i] = true
    * nums[i] > nums[i+1] 인 경우 check[i] = false
    * ** 그러나!! 위 경우 [4, 2, 6] 과 같은 배열을 처리하지 못함
    * 위 로직대로면 4, 6을 2번바꿔야한다고 판단하기때문에 false를 반환한다.
    * 하지만 2를 5로 바꾸는 경우가 있기때문에 정답이 아니다.
    * 정방향, 역방향으로 탐색한 결과 중 가장 작은값을 선택하는 방식으로 해결하면 될 것 같다.
    * (현재인덱스를 고치냐 다음인덱스를 고치냐..)*/
    public static boolean checkPossibility(int[] nums) {
        boolean[] check = new boolean[nums.length];
        boolean[] checkReverse = new boolean[nums.length];
        int formerMax = nums[0];
        int formerMin = nums[nums.length - 1];
        check[0] = true;
        checkReverse[nums.length - 1] = true;
        // ascending
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i] && formerMax <= nums[i]) {
                check[i] = true;
            } else {
                check[i] = false;
            }
            formerMax = Math.max(formerMax, nums[i]);
        }
        // descending
        for (int i = nums.length - 2; 0 <= i; i--) {
            if (nums[i] <= nums[i + 1] && nums[i] <= formerMin) {
                checkReverse[i] = true;
            } else {
                checkReverse[i] = false;
            }
            formerMin = Math.min(formerMin, nums[i]);
        }
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i] == false) {
                cnt1++;
            }
            if (checkReverse[i] == false) {
                cnt2++;
            }
        }

        return (Math.min(cnt1, cnt2) <= 1);
    }
}
