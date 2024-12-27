class Solution {

    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
		int[] arr = { -1, -1 };
       return searchRange1(nums, target, low, high,arr);
    }
        
    
        
	public int[] searchRange1(int[] nums, int target, int low, int high,int[] arr)
	{
		int mid = low + (high - low) / 2;
        if (nums.length == 0)
		{
			arr[0] = -1;
			arr[1] = -1;
		}
		if (high < low)
		{
			arr[0] = high;
			return arr;
		}
		if (target == nums[low] && nums[high] == nums[low])
		{
			arr[0] = low;
			arr[1] = high;
			return arr;
		}

		if (mid == low)
		{

			if (target == nums[low])
			{
				arr[0] = low;
				arr[1] = low;
			}
			else if (target == nums[high])
			{
				arr[0] = high;
				arr[1] = high;
			}
			else
			{
				arr[0] = -1;
				arr[1] = -1;
			}
			return arr;
		}
		
		if (nums[mid] < target)
		{
			searchRange1(nums,target, mid + 1, high, arr);
		}
		else if (nums[mid] > target)
		{
			searchRange1(nums, target, low, mid - 1, arr);
		}
		else
		{
			arr[0] = mid;
			arr[1] = mid;

			
			int t1 = mid;
			while (t1 > low && nums[t1] == nums[t1 - 1])
			{
				t1--;
				arr[0] = t1;
			}

			int t2 = mid;
			while (t2 < high && nums[t2] == nums[t2 + 1])
			{
				t2++;
				arr[1] = t2;
			}
			return arr;
		}
		return arr;

	}
    
    
    
}