class Solution {
    public int reverse(int x) {
        //int a=x;
        
        long rev=0;
        while(x!=0){
            long rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev>2147483647 || rev<-2147483647) return 0;
         else return (int)rev;
       
        
    }
}