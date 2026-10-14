class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int zero=0;
        int product=1;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(x==0){
                zero++;
                idx=i;
            }
            else{
                product*=x;
            }
        }

        if(zero>1)return arr;
        else if(zero==1)arr[idx]=product;
        else {
            for(int i=0;i<nums.length;i++){
                arr[i]=product/nums[i];
            }
        }

        return arr;
    }
}  
