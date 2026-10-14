class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int total=0;
        int max=0;
        for(int i:nums){
            total = total*i+i;

            max = Math.max(max,total);
        }

        return max;
    }
}