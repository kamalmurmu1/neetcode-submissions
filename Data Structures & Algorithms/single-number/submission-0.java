class Solution {
    public int singleNumber(int[] nums) {
        int[] counter = new int[20000];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                counter[10000 + (-nums[i])]++;
            } else {
                counter[nums[i]]++;
            }
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 1) {
                if (i > 10000) {
                    return -(i - 10000);
                } else {
                    return i;
                }
            }
        }
        return 0;
    }
}
