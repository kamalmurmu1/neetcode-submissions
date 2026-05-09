class Solution {
    public int countHours(int[] piles, int k) {
        int resultHours = 0;
        for (int i = 0; i < piles.length; i++) {
            int tempHours = piles[i] / k;
            resultHours += tempHours;
            if (piles[i] % k != 0) {
                resultHours++;
            }
        }
        return resultHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxNumber = piles[0];
        int result = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > maxNumber) {
                maxNumber = piles[i];
            }
        }
        if (piles.length == h) {
            return maxNumber;
        }
        result = maxNumber;
        int start = 1, end = maxNumber;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = countHours(piles, mid);
            if (res <= h) {
                end = mid - 1;
                result = Math.min(result, mid);
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
