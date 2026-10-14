class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String x:strs){
            char temp[] = x.toCharArray();
            Arrays.sort(temp);
            String sort = new String(temp);
            if(!map.containsKey(sort))map.put(sort,new ArrayList<>());

            map.get(sort).add(x);
        }

        List<List<String>> res = new ArrayList<>();

        for(String x:map.keySet()){
            res.add(map.get(x));
        }

        return res;
    }
}
