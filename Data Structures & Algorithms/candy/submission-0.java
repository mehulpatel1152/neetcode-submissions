class Solution {
    public int candy(int[] ratings) {

        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b)->a.val - b.val);
        int res[] = new int[ratings.length];
        int total=ratings.length;
        Arrays.fill(res,1);
        
        for(int idx=0;idx<ratings.length;idx++) minHeap.add(new Pair(ratings[idx],idx));

        while(minHeap.isEmpty()!=true){
            Pair temp = minHeap.poll();
            int prev=temp.idx-1,cur=temp.idx,next=temp.idx+1,val=temp.val;

            int left  = prev<0?0:(ratings[prev]<ratings[cur]?res[prev]:0);
            int right = next>=ratings.length?0:(ratings[next]<ratings[cur]?res[next]:0);
            
            total += Math.max(left,right);
            res[cur] += Math.max(left,right);
            
        }

        return total;
    }
}

class Pair{
    int val;
    int idx;

    public Pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}