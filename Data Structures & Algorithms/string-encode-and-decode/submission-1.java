class Solution {
    public String encode(List<String> strs) {
        String resultString = "";
        for (String s : strs) {
            resultString = resultString + s + "P";
        }
        return resultString;
    }

    public List<String> decode(String str) {
        List<String> resultList = new ArrayList<>();
        String tempStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'P') {
                resultList.add(tempStr);
                tempStr = "";
                continue;
            }
            tempStr = tempStr + str.charAt(i);
        }
        return resultList;
    }
}
