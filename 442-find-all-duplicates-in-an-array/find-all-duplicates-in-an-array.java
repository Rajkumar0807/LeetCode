class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
     Arrays.sort(nums);
     List<Integer> li=new ArrayList<>();
     for(int i=0;i<nums.length-1;i++)
     {
        if(nums[i]==nums[i+1]&&!(li.contains(nums[i]))) li.add(nums[i]);
     }
     return li;
        
    }
}