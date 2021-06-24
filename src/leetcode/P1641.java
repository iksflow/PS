package leetcode;

public class P1641 {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(2));
    }
    /*
    * D(1) = 5
    * D(2) = D(1) + D(1) - 1 + D(1) - 2 + D(1) - 3 + D(1) - 4 = D(1) * 5 - 10 = 15
    * D(3) = D(2) * 5 - 10*/
    public static int countVowelStrings(int n) {
        int dp[] = new int[5];

        for(int i =0; i< 5; i++){
            dp[i] = 1;
        }
        for(int i = 1; i<= n; i++){
            for(int j=1; j < 5; j++){
                dp[j] += dp[j-1];
            }
        }
        return dp[4];
    }
}
