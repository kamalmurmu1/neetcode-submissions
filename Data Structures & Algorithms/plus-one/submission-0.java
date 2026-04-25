class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length - 1;
        int carry = 1;
        while (k >= 0) {
            int sum = digits[k] + carry;
            digits[k] = sum % 10;
            carry = sum / 10;
            k--;
        }
        if (carry > 0) {
            int[] resultDigits = new int[digits.length + 1];
            resultDigits[0] = carry;
            for (int i = 1; i < digits.length + 1; i++) {
                resultDigits[i] = digits[i - 1];
            }
            return resultDigits;
        }
        return digits;
    }
}
