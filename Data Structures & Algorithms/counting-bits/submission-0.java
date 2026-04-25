class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0, m = i;
            while (m > 0) {
                if (m % 2 == 1) {
                    count++;
                }
                m /= 2;
            }
            result[i] = count;
        }
        return result;
    }
}
