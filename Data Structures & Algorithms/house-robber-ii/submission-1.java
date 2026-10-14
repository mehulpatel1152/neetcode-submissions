class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int dp[] = new int[nums.length + 2];

        for (int i = 0; i < nums.length; i++) {
            dp[i + 2] = Math.max(dp[i] + nums[i], dp[i + 1]);
        }
        int a1=dp[nums.length ];
        
        dp = new int[nums.length + 2];

        for (int i = 1; i < nums.length; i++) {
            dp[i + 2] = Math.max(dp[i] + nums[i], dp[i + 1]);
        }

        return Math.max(a1,dp[nums.length+1]);
    }
}
