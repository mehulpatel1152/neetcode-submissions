class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x:nums)map.put(x,map.getOrDefault(x,0)+1);

        ArrayList<Integer> bucket[] = new ArrayList[nums.length+1];

        for(int x:map.keySet()){
            if(bucket[map.get(x)]==null)bucket[map.get(x)]=new ArrayList<>();

            bucket[map.get(x)].add(x);
        }


        int res[] = new int[k];
        int n=0;
        for(int i=nums.length;i>=0;i--){
            if(n==k)break;
            if(bucket[i]==null)continue;
            for(int x:bucket[i]){
                if(n==k)break;
                res[n++]=x;
            }
        }

        return res;
    }
}
