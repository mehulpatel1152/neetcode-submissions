class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x:nums)map.put(x,0);

        int longest=0;

        for(int x:new HashSet<>(map.keySet())){
            if(map.get(x)==1)continue;
            map.put(x,1);
            int l = 1;
            int temp=x+1;
            while(map.containsKey(temp)){
                map.put(temp,1);
                l++;
                temp++;
                
            }

            longest=Math.max(longest,l);
        }
        
        return longest;

    }
}
