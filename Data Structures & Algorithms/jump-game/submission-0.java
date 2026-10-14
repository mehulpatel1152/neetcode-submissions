class Solution {
    public boolean canJump(int[] nums) {
     int dp[]=new int[nums.length];

     int max=nums[0];
     for(int i=0;i<=max && i<nums.length;i++){
        dp[i]=1;
        max = Math.max(max,i+nums[i]);
     }   

     return dp[nums.length-1]!=0;
    }
}
