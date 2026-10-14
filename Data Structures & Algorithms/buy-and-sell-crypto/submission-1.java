class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        int initial=prices[0];

        for(int i=1;i<prices.length;i++){
            int temp=prices[i] - initial;

            if(initial>prices[i]){
                profit=Math.max(profit,temp);
                initial=prices[i];
                temp=0;
            }else{
                if(profit<temp){
                    profit=temp;
                }
            }

        }

        return profit;
    }
}
