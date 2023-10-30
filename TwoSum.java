class TwoSum 
{

    static int[] findTwoSum(int[] nums, int target) 
	{
        for (int i = 0; i < nums.length - 1; i++) 
		{
            for (int j = i + 1; j < nums.length; j++) 
			{
                if (nums[i] + nums[j] == target) 
				{
                    return new int[]{i, j};
                }
            }
        }
        // If no such pair is found, you can return null or an empty array
        return new int[0];
    }

    public static void main(String[] args)
	{
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        for (int index : result) 
		{
            System.out.println(index);
        }
    }
}