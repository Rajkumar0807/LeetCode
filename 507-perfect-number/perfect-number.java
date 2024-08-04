class Solution {
    public boolean checkPerfectNumber(int n) 
    {
        if(n==1) return false;
        int s=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0)
            {
                s=s+i;
                int x=n/i;
                if(x!=i&&i!=1) s=s+x;
            }
        }
        return s==n;
        
    }
}