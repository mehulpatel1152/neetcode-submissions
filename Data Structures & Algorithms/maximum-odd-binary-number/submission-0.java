class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0,zero=0;
        
        StringBuilder str = new StringBuilder();
        for(char x:s.toCharArray()){
            if(x=='1')one++;
            else zero++;
        }

        
         
        while(one>1){
            str.append('1');
            one--;
        }

        while(zero>0){
            str.append('0');
            zero--;
        }

        while(one>=1){
            str.append('1');
            one--;
        }

        return str.toString();


        


        

                
    }
}

