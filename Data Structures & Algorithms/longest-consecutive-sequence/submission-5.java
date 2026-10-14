class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int x:nums)set.add(x);
        int max=1;
        for(int x:set){

            if(set.contains(x-1))continue;
            else{
                int temp=1;
                int val=x;
                while(set.contains(val+1)){
                    temp++;
                    val++;
                }

                max = Math.max(max,temp);
            }
        }       

        return max;
    }
}
