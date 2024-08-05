class Solution {
    public List<Integer> getRow(int n) 
    {
        long line=n+1;
        List<Integer> li =new ArrayList<>();
        long C=1;
        for (long i = 1; i <= line; i++) 
            {
                li.add((int)C);
                C = C * (line - i) / i;
                
            }
            return li;
        
    }
}