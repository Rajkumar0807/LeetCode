class Solution {
    public char findTheDifference(String s, String t) 
    {
        int n1=0;
        int n2=0;
     for(int i=0;i<s.length();i++)
     {
        n1=n1+s.charAt(i);
     }
       for(int i=0;i<t.length();i++)
     {
        n2=n2+t.charAt(i);
     }
     char ch=(char)(n2-n1);
     return ch;


        
    }
}