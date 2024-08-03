class Solution {
    public boolean isPalindrome(String s) {
       String s1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int n=(int)c-48;
            if( (c >= 'a' && c <= 'z') ||(n>=0&&n<=9)){
                s1=s1+s.charAt(i);
            }
             if((c >= 'A' && c <= 'Z')){
                s1=s1+Character.toLowerCase(c);
            }
            
        }
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        return s1.equals(s2);
        
    
    }
}