class Solution {
    public int lengthOfLastWord(String s) {
        String resultStr = "";
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && resultStr.length() > 0) {
                break;
            } else {
                if (s.charAt(i) != ' ') {
                    resultStr += s.charAt(i);
                }
            }
        }
        result = resultStr.length();
        return result;
    }
}