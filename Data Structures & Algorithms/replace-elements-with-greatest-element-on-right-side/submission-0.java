class Solution {
    public int[] replaceElements(int[] arr) {
        int i=arr.length-1;

        int prev=-1;

        for(;i>=0;i--){
            int temp =arr[i];
            arr[i]=prev;

            prev=Math.max(prev,temp);
        }

        return arr;
    }
}