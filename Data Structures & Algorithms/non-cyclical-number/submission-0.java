class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Integer> existCheck = new HashMap<>();
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum += ((n % 10) * (n % 10));
                n /= 10;
            }
            n = sum;
            if (existCheck.get(sum) != null) {
                return false;
            } else {
                existCheck.put(sum, 1);
            }
        }
        return true;
    }
}
