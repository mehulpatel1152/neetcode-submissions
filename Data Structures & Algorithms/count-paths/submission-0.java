class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(m,n,m-1,n-1,dp);
    }

    public int helper(int m,int n,int i,int j,int [][]dp){
        if(i<0 || j<0 || i>=m || j>=n)return 0;
        if(i==0 && j==0 )return  1;

        if(dp[i][j]!=-1)return dp[i][j];
        int left = helper(m,n,i,j-1,dp);
        int right = helper(m,n,i-1,j,dp);

        return dp[i][j] = left+right;


    }
}

