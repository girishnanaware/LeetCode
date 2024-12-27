class Solution {
    int temp = 0;

    public int reverse(int x) {
         while (x != 0) {
            int remainder = x % 10;
            x = x / 10;

      
            if (temp > Integer.MAX_VALUE / 10 || (temp == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (temp < Integer.MIN_VALUE / 10 || (temp == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }

            temp = temp * 10 + remainder;
        }
        return temp;
    }
}