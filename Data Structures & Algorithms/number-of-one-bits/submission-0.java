class Solution {
    public int hammingWeight(int n) {
        int resultCount = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                resultCount++;
            }
            n /= 2;
        }
        return resultCount;
    }
}
