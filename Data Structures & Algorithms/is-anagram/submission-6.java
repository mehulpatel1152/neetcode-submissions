class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int l = s.length();
        int arr[] = new int[26];


        for(int i = 0;i<l;i++){
            arr[s.charAt(i)%97]++;
            arr[t.charAt(i)%97]--;
        }

        for(int x:arr)if(x!=0)return false;



        return true; 
    }
}
