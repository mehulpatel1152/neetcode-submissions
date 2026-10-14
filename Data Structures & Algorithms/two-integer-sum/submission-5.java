class Solution {
    public int[] twoSum(int[] arr, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                if(map.get(target-arr[i])!=i)return new int[]{map.get(target-arr[i]),i};
            }
            else if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }

        }

            return new int[]{-1,-1};



    }
}
