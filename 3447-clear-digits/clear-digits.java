class Solution {
    public String clearDigits(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(Character.isLetter(ch))
           {
               st.push(ch);
           }
           if(Character.isDigit(ch))
           {
            if(!st.isEmpty())
            st.pop();
           }
        }

        String s1="";
        while(!st.isEmpty())
        {
            s1=s1+st.peek();
            st.pop();
        }
        
      String ans="";
       for(int j=s1.length()-1;j>=0;j--)
       {
           ans=ans+s1.charAt(j);
       }
      return ans;
    }
}