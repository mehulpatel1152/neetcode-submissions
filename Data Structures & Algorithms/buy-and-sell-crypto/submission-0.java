class Solution {
    public int maxProfit(int[] prices) {
        int net=0;
        int profit=0;
        int cur=prices[0];


        for(int i=1;i<prices.length;i++){
            if(prices[i] -cur<0){
                net=Math.max(net,profit);
                cur = prices[i];
                profit=0;
                
            }else if(prices[i] - cur>=profit){
                net=Math.max(net,profit);
                profit=prices[i]-cur;
            }
        }


        return Math.max(net,profit);
    }
}
