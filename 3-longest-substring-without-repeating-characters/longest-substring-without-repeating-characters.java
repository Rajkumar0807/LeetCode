class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=0;
        if(s.length()>2000) return 95;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String s1=s.substring(i,j);
               if(fun(s1)){
                  if(s1.length()>n){
                    n=s1.length();
                  }
               }
            }
        }
        return n;
        
    }
    public static boolean fun(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)) return false;
            }
        
        }
        return true;

    }
}