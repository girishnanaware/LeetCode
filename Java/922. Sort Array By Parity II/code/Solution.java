class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sortedArray[j] = arr[i];
                j = j + 2;
            } else {

                sortedArray[k] = arr[i];
                k = k + 2;
            }
        }
        return sortedArray;
    }
}