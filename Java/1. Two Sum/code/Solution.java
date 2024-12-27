class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = { 0, 0 };
		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = nums.length-1; j > 0; j--)
			{
				if ((nums[i] + nums[j]) == target && i!=j)
				{
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return arr;
    }
}