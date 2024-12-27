class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        
        if(nums.length==1)
        {
            return nums[0];
        }

		for (int i = 0; i < nums.length; i++)
		{
			max_ending_here = max_ending_here + nums[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
            {
				max_ending_here = 0;
                if (max_so_far < nums[i])
				{
					max_so_far = nums[i];
				}
            }
		}
        return max_so_far;
    }
}