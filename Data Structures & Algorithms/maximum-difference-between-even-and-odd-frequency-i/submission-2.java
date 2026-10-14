class Solution {
    public int maxDifference(String s) {
        int frq[] = new int[26+1];

        for(char x:s.toCharArray())frq[x%26]++;

        int minE=s.length();
        int maxO=0;

        for(int i:frq){
            if(i%2==0){
                if(i!=0)minE=Math.min(minE,i);
                // maxE=Math.max(maxE,i);
            }else{
                // if(i!=0)minO=Math.min(minO,i);
                maxO=Math.max(maxO,i);
            }
        }

        // int a1 = Math.abs(minE-maxO);
        int a2 = maxO-minE;

        return a2;


    }
}