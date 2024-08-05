class Solution {
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> result=new ArrayList<>();
         for (int line = 1; line <= n; line++)
         {
            List<Integer> li=new ArrayList<>();
             int C = 1;
            for (int i = 1; i <= line; i++) 
            {
                li.add(C);
                C = C * (line - i) / i;
            }
            result.add(new ArrayList<>(li));
         }
          
        return result;
    }
}