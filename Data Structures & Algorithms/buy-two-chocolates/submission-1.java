class Solution {
    public int buyChoco(int[] prices, int money) {
        int first  = Integer.MAX_VALUE;       
        int second = Integer.MAX_VALUE;

        for(int i:prices){

            if(i<first){
                second = first;
                first=i;
            }
            else if(i<second){
                second=i;
            }
        }

        return first+second >  money ? money : money - (first+second) ;
    }
}