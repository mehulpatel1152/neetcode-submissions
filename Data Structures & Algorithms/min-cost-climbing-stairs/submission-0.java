class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];

        Arrays.fill(dp, -1);

        return Math.min(min(n - 1, dp, cost), min(n - 2, dp, cost));
    }

    public int min(int n, int dp[], int cost[]) {
        if (n < 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int one = cost[n] + min(n - 1, dp, cost);
        int two = cost[n] + min(n - 2, dp, cost);

        return dp[n] = Math.min(one, two);
    }
}
