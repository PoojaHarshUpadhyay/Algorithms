import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
       int j = 0;
        if(nums.length == 0 )
        {
            return 0;
        }
        for(int i = 1; i < nums.length; i++)
        {
            if( nums[j] != nums[i])
            {
                j++;
                nums[j] = nums[i];
            }
        }

        return j+1;
    }
}