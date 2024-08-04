class Solution {
    public int majorityElement(int[] nums) {
        int max=0;int ans=0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) c++;
            }
            if(max<c){ max=c;ans=nums[i];}
        }
        return ans;
    }
}