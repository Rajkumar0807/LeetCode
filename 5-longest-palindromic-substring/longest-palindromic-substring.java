class Solution {
    public String longestPalindrome(String s) {
        String n="";
          for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
              String s1=s.substring(i,j);
              if((fun(s1)).length()>n.length()) n=s1;

            }
       
        }
        return n;
    }
        public static String fun(String s){
              int i=0;int j=s.length()-1;
              while(i!=j&&i!=j+1){
                if(s.charAt(i)!=s.charAt(j)) return "";
                i++;
                j--;
                
              }
              return s;

        }
    
}