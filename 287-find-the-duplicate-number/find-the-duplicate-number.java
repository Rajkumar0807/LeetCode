class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int n=-1;
     while(i>=0 && i<=nums.length-2){
            if(nums[i]==nums[i+1])
             {n=nums[i]; 
             break;
             }
             i++;
        }
        return n;
    }
}