class Solution {
    public int tribonacci(int n) {
        if(n<1)return 0;
        if(n<=1)return 1;
        int Tn=0;
        int Tnp1=1;
        int Tnp2=1;

        for(int i=3;i<=n;i++){
            int Tnp3 = Tn +Tnp1 + Tnp2;
            Tn = Tnp1;
            Tnp1 = Tnp2;
            Tnp2 = Tnp3;
        }


        return Tnp2;
    }
}