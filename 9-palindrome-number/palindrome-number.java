class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int x1=x;
      while(x!=0 && x>0){
        int rem=x%10;
        sum=sum*10+rem;
        x=x/10;

      }
      if(sum==x1) return true;
      else return false;
        
    }
}