class Solution {
    public boolean canJump(int[] nums) {
      int  min=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(i>min)
            {
                return false;
            }
            min=Math.max(min,i+nums[i]);
        }
        return true;
        
    }
}