class Solution {
    public int longestConsecutive(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            if(x<=min)min=x;
            if(x>=max)max=x;
            set.add(x);
        }


        int longest=0;
        int temp=0;
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                longest = Math.max(longest,temp);
                temp=0;
            }else{
                temp++;
            }
        }
        longest=Math.max(temp,longest);
        return longest;

    }
}
