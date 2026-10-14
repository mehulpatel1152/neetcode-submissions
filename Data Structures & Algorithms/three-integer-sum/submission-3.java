class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){

            if(i>0 && nums[i]==nums[i-1])continue;

            int target = nums[i]*-1;

            int j=i+1,k=nums.length-1;
            while(j<k){

                
                
                int sum = nums[j] + nums[k];
                if(sum<target)j++;
                else if(sum>target)k--;
                else {
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j++],nums[k--])));
                    while( j<k-1 && nums[j]==nums[j-1])j++;
                    while(j<k && k<nums.length-1 && nums[k]==nums[k+1])k--;
                }
            }
        }   

        return res;
    }
}
