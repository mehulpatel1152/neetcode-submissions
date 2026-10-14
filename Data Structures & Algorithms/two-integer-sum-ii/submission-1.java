class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                int res[]={i+1,j+1};
                return res;
            }else if(nums[i]+nums[j]>target)j--;
            else i++;
        }

        return new int[]{-1,-1};
    }
}
