class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0,ten=0, twen=0;

        for(int cur:bills){
            // System.out.println("cur :"+cur);
            if(cur==5)five++;
            else if(cur==10){
                    if(five>=1){
                        five--;
                        ten++;
                    }else return false;
            }
            else{
                if(five>=3)five-=3;
                else if(five>=1 && ten>=1){
                    five--;
                    ten--;
                }
                else return false;
            }
        }

        return true;
    }
}