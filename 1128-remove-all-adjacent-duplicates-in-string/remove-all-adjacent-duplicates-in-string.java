class Solution {
    String s1="";
    public  void PrintStack(Stack<Character> s) 
{ 
    // If stack is empty then return 
    if (s.isEmpty()) 
        return ; 
     
    char x = s.peek(); 
 
    // Pop the top element of the stack 
    s.pop(); 
    
    s1=s1+x;
 
    // Recursively call the function PrintStack 
    PrintStack(s); 
 
    // Print the stack element starting 
    // from the bottom 
    
 
    // Push the same element onto the stack 
    // to preserve the order 
    s.push(x); 
    

    
} 
    public String removeDuplicates(String s) {
         Stack<Character> st=new Stack<>();
      for(char c:s.toCharArray())
      {
        if(!st.isEmpty()&&c==st.peek())
        {
            st.pop();
        }
        else
        {
            st.push(c);
        }
      }
      PrintStack(st);
      String ans="";
      for(int i=s1.length()-1;i>=0;i--){
           ans=ans+s1.charAt(i);
      }
      return ans;
    }
}