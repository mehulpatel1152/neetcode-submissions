class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int arr[] = new int[256];
        int mis=0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))mis++;
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]++;
        }

        int total=0;

        for(int x:arr)if(x%2!=0)total++;

        if(total>0 || mis>2)return false;

        return true;

    }
}
