class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count =0;
        int product = 1;
        int idx=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                idx=i;
                if(count>1)return new int[nums.length];
            }
            else product*=nums[i];
        }

        

        int res[] = new int[nums.length];
        if(count==1)res[idx]=product;
        else{
            for(int i=0;i<nums.length;i++){
                res[i]=product/nums[i];
            }
        }

        return res;
        
    }
}  
