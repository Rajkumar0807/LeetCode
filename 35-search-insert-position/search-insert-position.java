class Solution {
    public int searchInsert(int[] nums, int target) {
        int r=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)  r=i;
        }
        if(r!=-1) return r;
        
        else {
            int n=nums.length;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>target){
                    n=i;break;
                }
                
            }
            return n;
        }
    }
}