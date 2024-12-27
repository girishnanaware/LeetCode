class Solution {
    public boolean isPalindrome(int x) {
        int temp = 0;
        int sum = 0;
        int orgNum = x;
        if (x < 0) {
            return false;
        }
        if (x >= 0 && x < 10) {
            return true;
        }

        while (x > 0) {
            sum = (sum * 10) + x%10;
            x = x / 10;
        }
        return sum == orgNum;
    }
}