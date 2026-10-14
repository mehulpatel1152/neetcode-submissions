class Solution {
    public int maxArea(int[] heights) {
        int max=0;

        int i=0;
        int j=heights.length -1;

        while(i<j){
            max = Math.max(Math.abs(j-i) * Math.min(heights[i],heights[j]),max);
            if(heights[i]<heights[j])i++;
            else{
                j--;
            }
        }

        return max;
    }
}
