class Solution {
    public int buyChoco(int[] prices, int money) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b - a);

        for(int val:prices){
            maxHeap.add(val);
            if(maxHeap.size()>2)maxHeap.poll();
        }

        int total=0;
        int spend=money;
        while(maxHeap.size()>0){
            int cur=maxHeap.poll();
            if(cur>money)continue;

            money-=cur;
            total++;
        }

        return total==2?money:spend;
    }
}