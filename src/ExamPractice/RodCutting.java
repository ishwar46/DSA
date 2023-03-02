package ExamPractice;

public class RodCutting {
    public static int countWays(int n, int k) {
        int[] dp = new int[n+1];
        dp[0] = 1;

        for (int i = 2; i <= n; i += 2) {
            for (int j = 2; j <= k && j <= i; j += 2) {
                dp[i] += dp[i-j];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 4;
        int ways = countWays(n, k);
        System.out.println("Number of ways to cut the rod: " + ways); // Output: 3
    }
}

