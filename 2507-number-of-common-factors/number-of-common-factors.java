class Solution {
    public int commonFactors(int a, int b) 
    {
        List<Integer> l1=new ArrayList<>();
        int c=0;
       // List<Integer> l2=new ArrayList<>();
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
               c++;
               
            }
        } 
        return c;
               
    }
}