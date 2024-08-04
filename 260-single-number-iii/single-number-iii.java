class Solution {
    public int[] singleNumber(int[] nums) 

    {
        int arr[]=new int[2];
        if(nums.length==2)
        {
           if(nums[0]!=nums[1])
           {
            arr[0]=nums[0];
            arr[1]=nums[1];
           }
           else
           {
            return arr;
           }
           return arr;
        }
        int k=0;
      
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        return arr;
        
    }
}