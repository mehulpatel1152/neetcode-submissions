class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if (f.length == 1) {
            if (n == 0)
                return true;
            else
                return n - ((f[0] == 0 ? 1 : 0)) == 0;
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] != 0)
                continue;
            else if (i == 0) {
                if (f[i + 1] == 0) {
                    n--;
                    f[i] = 1;
                }
            } else if ((i == f.length - 1)) {
                if ((i == f.length - 1) && (f[i - 1] == 0)) {
                    n--;
                    f[i] = 1;
                }
            } else if (f[i - 1] == 0 && f[i] == 0 && f[i + 1] == 0) {
                n--;
                f[i] = 1;
            }
        }

        return n <= 0;
    }
}