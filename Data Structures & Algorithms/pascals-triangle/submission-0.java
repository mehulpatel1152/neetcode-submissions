class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(Arrays.asList(1)));

        if(n==1)return res;
        res.add(new ArrayList<>(Arrays.asList(1,1)));
        if(n==2)return res;

        for(int i=3;i<=n;i++){
            List<Integer> temp = new ArrayList<>();
            List<Integer> prev = res.get(res.size()-1);
            temp.add(1);

            for(int j=0;j<prev.size()-1;j++){
                temp.add(prev.get(j)+prev.get(j+1));
            }

            temp.add(1);

            res.add(temp);
        }

        return res;
        
    }
}