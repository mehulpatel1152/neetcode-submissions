class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] > nums[j])
                i = mid + 1;
            else
                j = mid;
        }

        j = nums.length + i - 1;

        while (i <=j) {
            int mid = i + (( j-i) / 2);
            int temp = (mid) % nums.length;

            if (nums[temp] < target)
                i = mid + 1;
            else if (nums[temp] > target)
                j = mid - 1;
            else return temp;
        }

        return -1;
    }
}
