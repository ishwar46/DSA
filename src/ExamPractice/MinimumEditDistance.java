package ExamPractice;

public class MinimumEditDistance {

    public static int minEditDistance(String s1, String s2) {
        int[] dp = new int[s2.length() + 1];
        for (int j = 0; j <= s2.length(); j++)
            dp[j] = j;
        for (int i = 1; i <= s1.length(); i++) {
            int prev = dp[0];
            dp[0] = i;
            for (int j = 1; j <= s2.length(); j++) {
                int temp = dp[j];
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[j] = prev;
                else
                    dp[j] = 1 + Math.min(dp[j-1], Math.min(prev, dp[j]));
                prev = temp;
            }
        }
        return dp[s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "geak";
        int minDistance = minEditDistance(s1, s2);
        System.out.println("The minimum edit distance between \"" + s1 + "\" and \"" + s2 + "\" is " + minDistance);
    }
}

