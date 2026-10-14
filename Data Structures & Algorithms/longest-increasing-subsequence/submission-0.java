class Solution {

    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length+1][nums.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums, nums.length - 1, -1,dp);
    }

    public int helper(int[] nums, int idx, int prevIdx,int[][] dp) {

        if (idx < 0) return 0;

        if(prevIdx!=-1 && dp[idx][prevIdx]!=-1)return dp[idx][prevIdx];

        int take = 0;

        // take current element
        if (prevIdx == -1 || nums[idx] < nums[prevIdx]) {
            take = 1 + helper(nums, idx - 1, idx,dp);
        }

        // skip current element
        int skip = helper(nums, idx - 1, prevIdx,dp);

        if(prevIdx!=-1 ) dp[idx][prevIdx]=Math.max(take, skip);

        return Math.max(take, skip);
    }

}