class Solution {
    public boolean isAnagram(String s, String t) {
        char[] tempStringArray1 = s.toCharArray();
        char[] tempStringArray2 = t.toCharArray();
        Arrays.sort(tempStringArray1);
        Arrays.sort(tempStringArray2);
        s = new String(tempStringArray1);
        t = new String(tempStringArray2);
        if (s.equals(t)) {
            return true;
        }
        return false;
    }
}
