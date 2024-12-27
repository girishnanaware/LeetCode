class Solution {
    public String longestCommonPrefix(String[] strs) {

        String str = "";
        String tempStr = "";
        boolean flag = false;
        if (strs.length == 0) {
            return str;
        }
        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs[0].length(); i++) {
            tempStr = tempStr + strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].startsWith(tempStr)) {
                    if (j == strs.length - 1) {
                        str = tempStr;
                    }
                } else {
                    flag = true;
                    break;
                }

            }
            if (flag) {
                break;
            }
        }

        return str.toString();

    }
}