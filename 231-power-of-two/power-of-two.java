class Solution {
    public boolean isPowerOfTwo(int n) {
        long prd=1;
boolean r=false;
if(n==1){r=true;}
        while(n!=1)
        {
         prd=prd*2;
         if(prd==n){ r= true;break;}
        else if(prd>n) { break;}

        }
        return r;
    }
}