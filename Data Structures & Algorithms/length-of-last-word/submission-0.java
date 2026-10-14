class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int ans=0;

        while(i>=0){
            if(ans==0 && s.charAt(i)==' '){
                i--;
            }else if(ans>=0 && s.charAt(i)==' ')break;
            else{ ans++;
            i--;
            }
        }


        return ans;
    }
}