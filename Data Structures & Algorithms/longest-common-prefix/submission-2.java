class Solution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();
        int min=Integer.MAX_VALUE;

        for(String str:strs)min=Math.min(min,str.length());

        int idx=0;

        while(idx<min){
            char temp=strs[0].charAt(idx);
            for(int i=0;i<strs.length;i++){
                if(idx>=strs[i].length() || strs[i].charAt(idx)!=temp ){
                    temp='A';
                    break;
                }
           }

            if(temp=='A')break;
            else prefix.append(temp);
            idx++;
        }

        return prefix.toString();
    }
}