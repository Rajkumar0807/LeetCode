 import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        String s2="";
        for(int i=0;i<len;i++){
            s2=s2+digits[i];
        }
          
       BigInteger n = new BigInteger(s2);  
       String input2 
            = "1"; 
      // BigInteger an=n+1;
       BigInteger b 
            = new BigInteger(input2); 
      BigInteger ans=n.add(b);
      String s=ans.toString();
      int arr[]=new int[s.length()];
      for(int i=0;i<s.length();i++){
        arr[i]=s.charAt(i)-48;
      }
      return arr;
      
    }
}