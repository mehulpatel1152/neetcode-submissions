class Solution {
    public int lengthOfLongestSubstring(String s) {

    int freq[] = new int[127];
    int longest=0;
    int init=0;
    

    for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)]!=0){
            while(freq[s.charAt(i)]!=0){
                freq[s.charAt(init)]=0;
                init++;
            }
            
        }
        freq[s.charAt(i)]=1;
        longest = Math.max(longest,i-init+1);
    }

    return longest;

    }
}




      