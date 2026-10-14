class Solution {
    public int maxArea(int[] heights) {
     int i=0,j=heights.length-1;

     int max=0;
     while(i<j){
        int temp = Math.min(heights[i],heights[j]) * (j-i);

        max=Math.max(temp,max);
        if(heights[i]>heights[j])j--;
        else if(!(heights[i]>heights[j]))i++;
        else {
            i++;
            j--;
        }
     }   

     return max;
    }
}
