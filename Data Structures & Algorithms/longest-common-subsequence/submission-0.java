class Solution {

    int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {

        dp = new int[text1.length()][text2.length()];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(text1, text2,
                      text1.length() - 1,
                      text2.length() - 1);
    }

    public int helper(String s1, String s2,
                      int l1, int l2) {

        if (l1 < 0 || l2 < 0) return 0;

        if (dp[l1][l2] != -1) {
            return dp[l1][l2];
        }

        if (s1.charAt(l1) == s2.charAt(l2)) {

            return dp[l1][l2] =
                1 + helper(s1, s2, l1 - 1, l2 - 1);
        }

        return dp[l1][l2] = Math.max(
            helper(s1, s2, l1, l2 - 1),
            helper(s1, s2, l1 - 1, l2)
        );
    }
}