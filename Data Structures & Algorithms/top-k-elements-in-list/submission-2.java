class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }


        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b)->b.freq - a.freq);

        for(int i:map.keySet()){
            maxHeap.add(new Pair(i,map.getOrDefault(i,0)));
        }

        int arr[] = new int[k];

        for(int i=1;i<=k && maxHeap.size()>0;i++){
            arr[i-1] = maxHeap.poll().key;
        }

        return arr;

    }
}

class Pair{
    int key,freq;

    public Pair(int key,int freq){
        this.key=key;
        this.freq=freq;
    }    
}
