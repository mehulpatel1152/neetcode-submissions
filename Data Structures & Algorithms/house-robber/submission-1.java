class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);

        return rob(n-1,nums,dp);
    }

    int rob(int n,int nums[],int dp[]){
        if(n<0)return 0;

        if(dp[n]!=-1)return dp[n];

        return dp[n] =  Math.max(rob(n-1,nums,dp),nums[n] + rob(n-2,nums,dp));
    }
}
