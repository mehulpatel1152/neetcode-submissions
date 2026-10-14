class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);
            if (!map.containsKey(s))map.put(s, new ArrayList<>());
        
            map.get(s).add(strs[i]);
        }

        List<List<String>> res = new ArrayList<>();

        for(String s:map.keySet()){
            res.add(map.get(s));
        } 

        return res;
    }
}

