class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(String x:strs){
            char[] arr = x.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(map.containsKey(temp))map.get(temp).add(x);
            else map.put(temp,new ArrayList<>(Arrays.asList(x)));
        }

        List<List<String>> res = new ArrayList<>();

        for(String x:map.keySet()){
            res.add(map.get(x));
        }

        return res;
    }
}

