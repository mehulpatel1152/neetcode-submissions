class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];

        int dp1[] = new int[n+1];
        int dp2[] = new int[n+1];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        return Math.max(solve(0,n-2,nums,dp1),solve(1,n-1,nums,dp2));
    }

    public int solve(int start,int end ,int nums[],int dp[]){

        int prev1 = 0;
        int prev2 = 0;
        int cur   = 0;


        for(int i=start;i<=end;i++){

            cur = Math.max(prev1 , prev2 + nums[i]);

            prev2=prev1;
            prev1=cur;
        }

        return cur;
    }
}
