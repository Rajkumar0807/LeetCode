class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
      int[] suffix = new int[n];
        int i,j; 
        suffix[n-1]=prices[n-1];
         for(i= n-2 ; i>=0 ; i--)
        {
            if(suffix[i+1] < prices[i])
            {
                suffix[i] = prices[i];
            }
            else 
            {
                suffix[i] = suffix[i+1];
            }
        }
        int max=0;
        for( i=0;i<n;i++){
            int m=suffix[i]-prices[i];
            if(max<m){
                max=m;
            }
        }
        return max;
    }
}