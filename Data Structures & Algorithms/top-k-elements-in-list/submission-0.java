class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<pair> heap = new PriorityQueue<>((a,b)->b.freq - a.freq);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int x:map.keySet()){
            pair temp = new pair(x,map.get(x));
            heap.add(temp);
        }

        int res[] = new int[k];

        for(int i=0;i<k && heap.size()>0;i++){
            pair temp = heap.poll();
            res[i]=temp.key;
        }


        return res;
        

        
    }
}

class pair{
    int key;
    int freq;
    public pair(int key,int freq){
        this.key=key;
        this.freq=freq;
    }
}
