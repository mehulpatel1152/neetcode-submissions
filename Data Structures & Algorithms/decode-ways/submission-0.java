class Solution {

    Integer[] dp;

    public int numDecodings(String s) {

        dp = new Integer[s.length()];

        return helper(s, 0);
    }

    public int helper(String s, int idx) {

        if (idx == s.length())
            return 1;

        if (s.charAt(idx) == '0')
            return 0;

        if (dp[idx] != null)
            return dp[idx];

        int one = helper(s, idx + 1);

        int two = 0;

        if (idx + 1 < s.length()) {

            int num = Integer.parseInt(s.substring(idx, idx + 2));

            if (num >= 10 && num <= 26)
                two = helper(s, idx + 2);
        }

        return dp[idx] = one + two;
    }
}