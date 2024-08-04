class Solution {
    public boolean checkPerfectNumber(int n) 
    {
        int s=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            {
                s=s+i;
            }
        }
        return s==n;
        
    }
}