class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int x:nums){
            if(set.contains(x))return !false;
            set.add(x);
        }

        return !true;
    }
}