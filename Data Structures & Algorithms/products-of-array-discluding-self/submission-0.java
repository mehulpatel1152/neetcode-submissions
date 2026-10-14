class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp=0;
        int zero=0;
        for(int x:nums){
            if(temp==0 && x!=0){
                temp=x;
                continue;
            }
            if(x==0){
                zero++;
                continue;
                
            }
            temp*=x;
        }   

        int res[] = new int[nums.length];
        if(zero>=2)return res;
        else if(zero==1){
            for(int i=0;i<res.length;i++){
                if(nums[i]==0)res[i]=temp;
            }
        }else{
            for(int i=0;i<res.length;i++){
                res[i]=temp/nums[i];
            }
        }

        return res;
    }
}  
