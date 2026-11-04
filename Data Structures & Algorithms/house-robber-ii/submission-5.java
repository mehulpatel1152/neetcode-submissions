class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        if(n==1)return nums[0];

        int dp1[] = new int[n+1];
        int dp2[] = new int[n+1];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        return Math.max(house(1,n-1,nums,dp1),house(0,n-2,nums,dp2));
    }

    public int house(int i,int n,int nums[],int dp[]){
        if(n<i)return 0;

        if(dp[n]!=-1)return dp[n];

        return dp[n] = Math.max(house(i,n-1,nums,dp),nums[n] + house(i,n-2,nums,dp));
    }
}
