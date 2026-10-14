class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }        

        int i=0;
        for(int x:map.keySet()){
            if(map.get(x)>(nums.length/2)){
                i=x;
                break;
            }
        }
        return i;
    }
}