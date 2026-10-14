class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,0,target,res,new ArrayList<>());
        return res;
    }

    void helper(int[] nums,int idx,int target,List<List<Integer>> res,List<Integer> temp){
        if(target<0)return;
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(idx>=nums.length)return;

        temp.add(nums[idx]);
        helper(nums,idx,target - nums[idx],res,temp);//take
        temp.remove(temp.size()-1);
        helper(nums,idx+1,target,res,temp);//skip

    }
}
