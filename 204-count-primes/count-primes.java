class Solution {
    public int countPrimes(int n) 
    {
        if(n==3) return 1;
        if(n==0||n==1||n==2) return 0;
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
             arr[i]=i+2; 
        }
        for(int i=0;arr[i]<=Math.sqrt(n);i++)
        {
            if(arr[i]!=-1)
            {
                for(int j=arr[i]*arr[i]-2;j<n-1;j+=arr[i])
                  {
                     arr[j]=-1;
                  }

            }
            
        }
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=-1&&arr[i]!=n) c++;
        }
        
        return c;
        
    }
}