class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> bucket[] = new ArrayList[nums.length+1];

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int x:map.keySet()){
            int val = map.get(x);
            if(bucket[val]==null)bucket[val] = new ArrayList<>();

            bucket[val].add(x);
        }

        int res[] = new int[k];
        int last=nums.length;
        int temp=0;
        while(k>0){
            for(int i=0;bucket[last]!=null && i<bucket[last].size() && k>0;i++){
                res[temp ++]=bucket[last].get(i);
                k--;
            }
            last--;
        }

        return res;
    }
}
