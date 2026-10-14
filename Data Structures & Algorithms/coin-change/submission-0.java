class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[][] = new int[coins.length +1][amount +1];

        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }

        int res = helper(coins,amount,0,dp);

        return res>=99999?-1:res;
    }
    public int helper(int coins[],int amount,int idx,int dp[][]){

        if(amount==0)return 0;
        if(amount<0)return 99999;
        if(idx>=coins.length)return 99999;

        if(dp[idx][amount]!=-1)return dp[idx][amount];

        int take = 1 + helper(coins,amount - coins[idx],idx,dp);
        int skip = helper(coins,amount ,idx+1,dp);

        return dp[idx][amount] = Math.min(take,skip);



    }
}
