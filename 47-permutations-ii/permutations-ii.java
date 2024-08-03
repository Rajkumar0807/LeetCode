class Solution {
    public void solve(int []nums,List<List<Integer>> result,int s,int e)
    {
        if(s==e)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
           if(!(result.contains(list)))
           {
                result.add(list);
                return;
            }
            return;

        }
        else
        {
            for(int i=s;i<=e;i++)
            {

            int temp=nums[i];
            nums[i]=nums[s];
            nums[s]=temp;
            solve(nums,result,s+1,e);
            temp=nums[i];
            nums[i]=nums[s];
            nums[s]=temp;
            }
        
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> result =new ArrayList<>();
        solve (nums,result,0,nums.length-1);
        return result;
        
    }
}