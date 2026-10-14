class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        double max = 1e9;
        int min = 1;

        int ans = Integer.MAX_VALUE;

        while (min <= max) {
            int mid = (int) (min + (max - min) / 2);

            if (test(mid, piles, h)) {
                max = mid - 1;
                ans = Math.min(ans, mid);
            } else
                min = mid + 1;
        }

        return ans;
    }

    public boolean test(int mid, int piles[], int h) {
        int total = 0;
        for (int x : piles) {
            total += Math.ceil((double)x / mid);
        }

        return total <= h;
    }
}
